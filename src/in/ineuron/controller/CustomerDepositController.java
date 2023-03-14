package in.ineuron.controller;

import in.ineuron.dto.CustomerDepositDto;
import in.ineuron.service.ICustomerDepositService;
import in.ineuron.service.ICustomerDepositService.OperationStatus;
import in.ineuron.vo.CustomerDepositVO;

public class CustomerDepositController
{
	// ICustomerDepositService implementation class object reference , Injected
	// through constrcutor dependency injection
	private ICustomerDepositService depositService;

	static
	{
		System.out.println("CustomerController .class file loading.....");
	}

	public CustomerDepositController(ICustomerDepositService depositService)
	{
		this.depositService = depositService;
		System.out.println("CustomerController One arg constrtur :: is called");
		System.out.println("depositServiceImpl object injected to Controller");
	}

	/**
	 * 
	 * @param depositVO The Value object containing customer deposit details in
	 *                  String.
	 */
	public OperationStatus peformDepsoit(CustomerDepositVO depositVO)
	{

		// converting Vo to DTO object
		CustomerDepositDto depositDto = new CustomerDepositDto();
		depositDto.setCustomerName(depositVO.getCustomerName());
		depositDto.setCustomerAddress(depositVO.getCustomerAddress());
		depositDto.setDepositAmount(Double.parseDouble(depositVO.getDepositAmount()));
		depositDto.setRateOfInterest(Double.parseDouble(depositVO.getRateOfInterest()));
		depositDto.setDepositTermInYears(Float.parseFloat(depositVO.getDepositTermInYears()));

		return depositService.computeAndStoreSimpleInterest(depositDto);
	}

}
