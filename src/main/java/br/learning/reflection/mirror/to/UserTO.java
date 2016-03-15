package br.learning.reflection.mirror.to;

public class UserTO {

	private AddressTO addressTO;
	private String mobileNumber;
	private NameTO nameTO;
	String salary;
	
	
	public AddressTO getAddressTO() {
		return addressTO;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}

	public NameTO getNameTO() {
		return nameTO;
	}
	public String getSalary() {
		return salary;
	}
	public void setAddressTO(AddressTO addressTO) {
		this.addressTO = addressTO;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public void setNameTO(NameTO nameTO) {
		this.nameTO = nameTO;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

}
