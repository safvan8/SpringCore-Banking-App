

package in.ineuron.service;

import in.ineuron.dto.CustomerDepositDto;

public interface ICustomerDepositService
{
	public enum OperationStatus
	{
		SUCCESS, FAILED
	}

	/**
	 * A method to calculate the simple interest and store it in the database.
	 * 
	 * @param depositDto The DTO object containing customer deposit details.
	 * @return An OperationStatus enum value indicating whether the operation was
	 *         successful or failed.
	 */
	public abstract OperationStatus computeAndStoreSimpleInterest(CustomerDepositDto depositDto);

}
