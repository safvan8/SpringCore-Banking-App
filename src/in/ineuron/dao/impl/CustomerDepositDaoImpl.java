/**
 * An implementation of the ICustomerDepositDao interface for performing all 
 * customer deposit record persistence opertaions
*/

package in.ineuron.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import in.ineuron.bo.CustomerDepositBO;
import in.ineuron.dao.ICustomerDepositDao;

public class CustomerDepositDaoImpl implements ICustomerDepositDao
{

	// MySQLdataSource object , injected through Constrcutor Dependency injection
	private DataSource mySQLDataSource;

	private static final String CUSTOMER_DEPOSIT_INSERT_QUERY = "INSERT INTO springdemodbo.customer_table "
			+ "(c_name,c_address,c_pamount,c_rate,c_time,c_interest_amount) VALUES (?,?,?,?,?,?)";

	static
	{
		System.out.println("CustomerDepositDaoImpl.class File loading........");
	}

	public CustomerDepositDaoImpl(DataSource mySQLDataSource)
	{
		this.mySQLDataSource = mySQLDataSource;
		System.out.println("CustomerDepositDaoImpl one Arg Constructor called.......");
		System.out.println("mySqlDataSource from Spring injected to CustomerDepositDaoImpl successfully...");
	}

	/**
	 * Inserts a new customer deposit record into the database.
	 *
	 * @param depositBo The CustomerDepositBO object containing the customer deposit
	 *                  details to be inserted.
	 * @return An integer value indicating the number of rows affected by the insert
	 *         operation. Returns Zero or Negative value if the operation fails.
	 */
	@Override
	public int customerDepositInsert(CustomerDepositBO depositBo)
	{
		System.out.println("CustomerDepositDaoImpl.customerDepositInsert(-)");
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int insertedRowCount = 0;

		try 
		{
			connection = mySQLDataSource.getConnection();
			System.out.println("Logical connection establsied sucessfully......");

			if (connection != null)
			{
				preparedStatement = connection.prepareStatement(CUSTOMER_DEPOSIT_INSERT_QUERY);

				// setting positional paramerters
				preparedStatement.setString(1, depositBo.getCustomerName());
				preparedStatement.setString(2, depositBo.getCustomerAddress());
				preparedStatement.setDouble(3, depositBo.getDepositAmount());
				preparedStatement.setDouble(4, depositBo.getRateOfInterest());
				preparedStatement.setFloat(5, depositBo.getDepositTermInYears());
				preparedStatement.setDouble(6, depositBo.getCalculatedSimpleInterest());

				// executing insert query
				insertedRowCount = preparedStatement.executeUpdate();
			}

		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{  
			// closing resources
			try
			{
				connection.close();
			} catch (SQLException e)
			{
			  e.printStackTrace();
			}
		}

		return insertedRowCount;
	}

}
