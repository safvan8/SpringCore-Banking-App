package in.ineuron.dao;

import in.ineuron.bo.CustomerDepositBO;

public interface ICustomerDepositDao
{
	/**
	 * Inserts a new customer deposit record into the database.
	 *
	 * @param depositBO The CustomerDepositBO object containing the customer deposit details to be inserted.
	 * @return An integer value indicating the number of rows affected by the insert operation. Returns -1 if the operation fails.
	 */
	public abstract int customerDepositInsert(CustomerDepositBO depositBO);

}
