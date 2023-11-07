package com.staff.manage.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "address", schema = "staff_schema")
public class AddressEntity {

	@Id
	@Column(name = "address_guid")
	private UUID addressGuid;

	private String line1;

	private String line2;

	private String line3;

	private String city;

	private String state;

	@Column(name = "postal_code")
	private String postalCode;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "staff_guid")
	private StaffEntity staffEntity;

	public AddressEntity() {

	}

	public AddressEntity(UUID addressGuid, String line1, String line2, String line3, String city, String state,
			String postalCode, StaffEntity staffEntity) {
		super();
		this.addressGuid = addressGuid;
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.staffEntity = staffEntity;
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

	public StaffEntity getStaffEntity() {
		return staffEntity;
	}

	public void setStaffEntity(StaffEntity staffEntity) {
		this.staffEntity = staffEntity;
	}

}
