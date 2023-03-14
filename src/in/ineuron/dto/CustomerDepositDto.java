/**
 * A DTO  bean for perfoming business operation on  customer deposit data from DAO Layer
 * 
 * @author Safvan 
 * @version 1.0
 */

package in.ineuron.dto;

public class CustomerDepositDto
{
	private String customerName;
	private String customerAddress;
	private Double depositAmount;
	private Double rateOfInterest;
	private Float depositTermInYears;

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

	@Override
	public String toString()
	{
		return "CustomerDto [customerName=" + customerName + ", customerAddress=" + customerAddress + ", depositAmount="
				+ depositAmount + ", rateOfInterest=" + rateOfInterest + ", depositTermInYears=" + depositTermInYears
				+ "]";
	}

}
