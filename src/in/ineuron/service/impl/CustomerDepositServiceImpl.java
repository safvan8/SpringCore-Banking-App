/**
 * This class represents the implementation of the ICustomerDepositService interface.
 * thi class provides methods to perfrom all buisiness operations on CustomerDeposit objects.
 */

package in.ineuron.service.impl;

import in.ineuron.bo.CustomerDepositBO;
import in.ineuron.dao.ICustomerDepositDao;
import in.ineuron.dto.CustomerDepositDto;
import in.ineuron.service.ICustomerDepositService;

public class CustomerDepositServiceImpl implements ICustomerDepositService
{
	// ICustomerDepositDao implementation class object reference , Injected through
	// constrcutor dependency injection
	private ICustomerDepositDao customerDepositDao;

	static
	{
		System.out.println("CustomerDepositServiceImpl.class file loading.......");

	}

	public CustomerDepositServiceImpl(ICustomerDepositDao customerDepositDao)
	{
		this.customerDepositDao = customerDepositDao;
		System.out.println("CustomerDepositServiceImpl : One arg constrcutor");
		System.out.println("customerDepositDao object injected to Service layer ");
	}

	/**
	 * A method to calculate the simple interest and store it in the database.
	 * 
	 * @param depositDto The DTO object containing customer deposit details.
	 * @return An OperationStatus enum value indicating whether the operation was
	 *         successful or failed.
	 */
	@Override
	public OperationStatus computeAndStoreSimpleInterest(CustomerDepositDto depositDto)
	{
		// calculating simple interest and generating Bo object

		Double simpleInterest = 0.0;

		simpleInterest = (depositDto.getDepositAmount() * depositDto.getRateOfInterest()
				* depositDto.getDepositTermInYears()) / 100;

		// converting dto to Bo object
		CustomerDepositBO depositBo = new CustomerDepositBO();
		// setting calculated interest amount
		depositBo.setCalculatedSimpleInterest(simpleInterest);

		depositBo.setCustomerName(depositDto.getCustomerName());
		depositBo.setCustomerAddress(depositDto.getCustomerAddress());
		depositBo.setDepositAmount(depositDto.getDepositAmount());
		depositBo.setRateOfInterest(depositDto.getRateOfInterest());
		depositBo.setDepositTermInYears(depositDto.getDepositTermInYears());

		int insertedRowsCount = customerDepositDao.customerDepositInsert(depositBo);

		OperationStatus status = null;

		if (insertedRowsCount > 0)
			status = OperationStatus.SUCCESS;
		else
			status = OperationStatus.FAILED;

		return status;
	}

}
