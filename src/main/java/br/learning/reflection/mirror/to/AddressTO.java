package br.learning.reflection.mirror.to;

public class AddressTO {
	private String streetName;

	// on purpose
	private Long number;

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

}
