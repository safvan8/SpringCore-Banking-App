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
	private Double depositAmount;
	private Double rateOfInterest;
	private Float depositTermInYears;

	// additinal variable for storing the calculated interest amount
	private Double calculatedSimpleInterest;

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

	public Double getDepositAmount()
	{
		return depositAmount;
	}

	public void setDepositAmount(Double depositAmount)
	{
		this.depositAmount = depositAmount;
	}

	public Double getRateOfInterest()
	{
		return rateOfInterest;
	}

	public void setRateOfInterest(Double rateOfInterest)
	{
		this.rateOfInterest = rateOfInterest;
	}

	public Float getDepositTermInYears()
	{
		return depositTermInYears;
	}

	public void setDepositTermInYears(Float depositTermInYears)
	{
		this.depositTermInYears = depositTermInYears;
	}

	public Double getCalculatedSimpleInterest()
	{
		return calculatedSimpleInterest;
	}

	public void setCalculatedSimpleInterest(Double calculatedSimpleInterest)
	{
		this.calculatedSimpleInterest = calculatedSimpleInterest;
	}

	@Override
	public String toString()
	{
		return "CustomerDepositBO [customerName=" + customerName + ", customerAddress=" + customerAddress
				+ ", depositAmount=" + depositAmount + ", rateOfInterest=" + rateOfInterest + ", depositTermInYears="
				+ depositTermInYears + ", calculatedSimpleInterest=" + calculatedSimpleInterest + "]";
	}
}
