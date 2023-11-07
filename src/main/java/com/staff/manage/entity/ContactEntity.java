package com.staff.manage.entity;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "contact", schema = "staff_schema")
public class ContactEntity {
	@Id
	@Column(name = "contact_guid")
	private UUID contactGuid;

	private String type;

	private String value;

	@JsonBackReference("staff-contact")
	@ManyToOne
	@JoinColumn(name = "staff_guid")
	private StaffEntity staffEntity;

	public ContactEntity() {

	}

	public ContactEntity(UUID contactGuid, String type, String value, StaffEntity staffEntity) {
		super();
		this.contactGuid = contactGuid;
		this.type = type;
		this.value = value;
		this.staffEntity = staffEntity;
	}

	public UUID getContactGuid() {
		return contactGuid;
	}

	public void setContactGuid(UUID contactGuid) {
		this.contactGuid = contactGuid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public StaffEntity getStaffEntity() {
		return staffEntity;
	}

	public void setStaffEntity(StaffEntity staffEntity) {
		this.staffEntity = staffEntity;
	}

}
