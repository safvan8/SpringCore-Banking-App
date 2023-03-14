package in.ineuron.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

import in.ineuron.vo.CustomerDepositVO;

public class CustomerInputHandler
{
	// to make class singleton
	private static CustomerInputHandler customerInputHandler;

	public static CustomerInputHandler getCustomerInputHandler()
	{
		if (customerInputHandler == null)
			customerInputHandler = new CustomerInputHandler();

		return customerInputHandler;

	}

	/**
	 * To Display welcome message and current Day time
	 */
	public void displayWelcomeMessage() {
	    // Get the current time
	    LocalTime now = LocalTime.now();

	    // Get the hour and minute
	    int hour = now.getHour();
	    int minute = now.getMinute();

	    String message = "The current time is " + hour + ":" + minute;

	    String banner = "*******************************************************\n"
	            + "*                                                     *\n"
	            + "*             Welcome to our Banking App              *\n"
	            + "*               " + LocalDate.now()      + "                            *\n"
	            + "*             " + message + "               *\n"
	            + "*                                                     *\n"
	            + "*******************************************************\n";

	    System.out.println(banner);
	}


	/**
	 * @return CustomerDepostitVo object conatins all the deposit details entered by
	 *         Customer in String format
	 */
	public CustomerDepositVO acceptDepositInfoFromCustomer()
	{

		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)))
		{
			System.out.println("Enter customer name ::");
			String customerName = bufferedReader.readLine();

			System.out.println("Enter customer Address ::");
			String customerAddress = bufferedReader.readLine();

			System.out.println("Enter  PrinicipalAmount ::");
			String principalAmount = bufferedReader.readLine();

			System.out.println("Enter Rate of Intrest ::");
			String rateOfInterest = bufferedReader.readLine();

			System.out.println("Enter time Of Deposit in years ::");
			String timeOfDeposit = bufferedReader.readLine();

			// creating VO object with user entered values
			CustomerDepositVO customerDepositVO = new CustomerDepositVO();
			customerDepositVO.setCustomerName(customerName);
			customerDepositVO.setCustomerAddress(customerAddress);
			customerDepositVO.setDepositAmount(principalAmount);
			customerDepositVO.setRateOfInterest(rateOfInterest);
			customerDepositVO.setDepositTermInYears(timeOfDeposit);

			return customerDepositVO;

		} catch (Exception e)
		{
			System.err.println("Error occurred while reading input from user: " + e.getMessage());
			return null;
		}
	}
}
