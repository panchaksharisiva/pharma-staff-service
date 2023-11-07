package com.staff.manage.entity;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "staff", schema = "staff_schema")
public class StaffEntity {

	@Id
	@Column(name = "staff_guid")
	private UUID staffGuid;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "middle_name")
	private String middleName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "date_of_birth")
	private Date dateOfBirth;

	@Column(name = "gender")
	private String gender;

	@Column(name = "age")
	private int age;

	@Column(name = "status")
	private String status;

	@Column(name = "position")
	private String position;

	@Column(name = "salary")
	private double salary;

	@OneToOne(mappedBy="staffEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "address_guid")
	private AddressEntity addressEntity;

	@JsonManagedReference("staff-contact")
	@OneToMany(mappedBy = "staffEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ContactEntity> contactEntities;

	public StaffEntity() {

	}

	public StaffEntity(UUID staffGuid, String firstName, String lastName, String middleName, Date dateOfBirth,
			String gender, int age, String status, String position, double salary, AddressEntity addressEntity,
			List<ContactEntity> contactEntities) {
		super();
		this.staffGuid = staffGuid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.age = age;
		this.status = status;
		this.position = position;
		this.salary = salary;
		this.addressEntity = addressEntity;
		this.contactEntities = contactEntities;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
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

	public AddressEntity getAddressEntity() {
		return addressEntity;
	}

	public void setAddressEntity(AddressEntity addressEntity) {
		this.addressEntity = addressEntity;
	}

	public List<ContactEntity> getContactEntities() {
		return contactEntities;
	}

	public void setContactEntities(List<ContactEntity> contactEntities) {
		this.contactEntities = contactEntities;
	}

}
