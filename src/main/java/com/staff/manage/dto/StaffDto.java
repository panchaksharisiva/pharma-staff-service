package com.staff.manage.dto;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

public class StaffDto {

	private UUID staffGuid;

	private String firstName;

	private String middleName;

	private String lastName;

	private Date dateOfBirth;

	private String gender;

	private int age;

	private String status;

	private String position;

	private double salary;

	private AddressDto addressDto;

	private List<ContactDto> contactDtos;

	public StaffDto() {

	}

	public StaffDto(UUID staffGuid, String firstName, String middleName, String lastName, Date dateOfBirth,
			String gender, int age, String status, String position, double salary, AddressDto addressDto,
			List<ContactDto> contactDtos) {
		super();
		this.staffGuid = staffGuid;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.age = age;
		this.status = status;
		this.position = position;
		this.salary = salary;
		this.addressDto = addressDto;
		this.contactDtos = contactDtos;
	}

	public UUID getStaffGuid() {
		return staffGuid;
	}

	public void setStaffGuid(UUID staffGuid) {
		this.staffGuid = staffGuid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public AddressDto getAddressDto() {
		return addressDto;
	}

	public void setAddressDto(AddressDto addressDto) {
		this.addressDto = addressDto;
	}

	public List<ContactDto> getContactDtos() {
		return contactDtos;
	}

	public void setContactDtos(List<ContactDto> contactDtos) {
		this.contactDtos = contactDtos;
	}

	@Override
	public String toString() {
		return "StaffDto [staffGuid=" + staffGuid + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", age=" + age
				+ ", status=" + status + ", position=" + position + ", salary=" + salary + ", addressDto=" + addressDto
				+ ", contactDtos=" + contactDtos + "]";
	}

}
