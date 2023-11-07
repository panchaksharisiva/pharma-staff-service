package com.staff.manage.dto;

import java.util.UUID;

public class ContactDto {

	private UUID contactGuid;

	private String type;

	private String value;

	public ContactDto() {

	}

	public ContactDto(UUID contactGuid, String type, String value) {
		super();
		this.contactGuid = contactGuid;
		this.type = type;
		this.value = value;
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

	@Override
	public String toString() {
		return "ContactDto [contactGuid=" + contactGuid + ", type=" + type + ", value=" + value + "]";
	}

}
