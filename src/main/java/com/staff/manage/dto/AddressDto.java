package com.staff.manage.dto;

import java.util.UUID;

public class AddressDto {

	private UUID addressGuid;

	private String line1;

	private String line2;

	private String line3;

	private String city;

	private String state;

	private String postalCode;

	public AddressDto() {

	}

	public AddressDto(UUID addressGuid, String line1, String line2, String line3, String city, String state,
			String postalCode) {
		super();
		this.addressGuid = addressGuid;
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

	public UUID getAddressGuid() {
		return addressGuid;
	}

	public void setAddressGuid(UUID addressGuid) {
		this.addressGuid = addressGuid;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getLine3() {
		return line3;
	}

	public void setLine3(String line3) {
		this.line3 = line3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "AddressDto [addressGuid=" + addressGuid + ", line1=" + line1 + ", line2=" + line2 + ", line3=" + line3
				+ ", city=" + city + ", state=" + state + ", postalCode=" + postalCode + "]";
	}

}
