package in.ineuron.main;

import in.ineuron.vo.CustomerDepositVO;

public class ClientApp
{
	public static void main(String[] args)
	{
		// Conatins methods for all type of user inputs
		CustomerInputHandler inputHandler = CustomerInputHandler.getCustomerInputHandler();

		// to Display welcome message to user along with current time
		inputHandler.displayWelcomeMessage();

		// to get all customer details from the user in the form of Value object
		CustomerDepositVO customerDepositVO = inputHandler.acceptDepositInfoFromCustomer();
	}
}
