/**
 * A Business Object bean for performing persistence operations from DAO Layer.
 * This object conatins result storing varaible which are used for storing results generated 
 * after processing Buiness Logic
 * This Object in created in Service Layer for string the result after proceesing Buisiness logic on DTO object
 * 
 * @author Safvan 
 * @version 1.0
 */

package in.ineuron.bo;

public class CustomerDepositBO
{
	private String customerName;
	private String customerAddress;
	private String depositAmount;
	private String rateOfInterest;
	private String depositTermInYears;

	public String getCustomerName()
	{
		return customerName;
	}

	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	public String getCustomerAddress()
	{
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress)
	{
		this.customerAddress = customerAddress;
	}

	public String getDepositAmount()
	{
		return depositAmount;
	}

	public void setDepositAmount(String depositAmount)
	{
		this.depositAmount = depositAmount;
	}

	public String getRateOfInterest()
	{
		return rateOfInterest;
	}

	public void setRateOfInterest(String rateOfInterest)
	{
		this.rateOfInterest = rateOfInterest;
	}

	public String getDepositTermInYears()
	{
		return depositTermInYears;
	}

	public void setDepositTermInYears(String depositTermInYears)
	{
		this.depositTermInYears = depositTermInYears;
	}

	@Override
	public String toString()
	{
		return "CustomerBO [customerName=" + customerName + ", customerAddress=" + customerAddress + ", depositAmount="
				+ depositAmount + ", rateOfInterest=" + rateOfInterest + ", depositTermInYears=" + depositTermInYears
				+ "]";
	}

}
