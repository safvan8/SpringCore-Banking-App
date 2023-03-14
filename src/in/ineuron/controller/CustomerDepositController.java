package in.ineuron.controller;

import in.ineuron.service.ICustomerDepositService;
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
	public void peformDepsoit(CustomerDepositVO depositVO)
	{

	}

}
