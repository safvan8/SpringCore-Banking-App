/**
 * An implementation of the ICustomerDepositDao interface for performing all 
 * customer deposit record persistence opertaions
*/

package in.ineuron.dao.impl;

import javax.sql.DataSource;

import in.ineuron.bo.CustomerDepositBO;
import in.ineuron.dao.ICustomerDepositDao;

public class CustomerDepositDaoImpl implements ICustomerDepositDao
{
	// MySQLdataSource object , injected through Constrcutor Dependency injection
	private DataSource mySQLDataSource;

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
	 * @param depositBO The CustomerDepositBO object containing the customer deposit
	 *                  details to be inserted.
	 * @return An integer value indicating the number of rows affected by the insert
	 *         operation. Returns Zero or Negative value if the operation fails.
	 */
	@Override
	public int customerDepositInsert(CustomerDepositBO depositBO)
	{
		return 0;
	}

}
