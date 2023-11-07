package com.staff.manage.mapper;

import java.util.UUID;

import org.mapstruct.Mapper;

import com.staff.manage.dto.AddressDto;
import com.staff.manage.dto.ContactDto;
import com.staff.manage.dto.StaffDto;
import com.staff.manage.entity.AddressEntity;
import com.staff.manage.entity.ContactEntity;
import com.staff.manage.entity.StaffEntity;

@Mapper(componentModel = "spring")
public interface StaffMapper {

	public StaffEntity dtoToStaffEntity(StaffDto staffDto);

	public AddressEntity dtoToAddressEntity(AddressDto addressDto);

	public ContactEntity dtoToContactEntity(ContactDto contactDto);

	public StaffDto entityToStaffDto(StaffEntity staffEntity);

	public AddressDto entityToAddressDto(AddressEntity addressEntity);

	public ContactDto entityToContactDto(ContactEntity contactEntity);

	@SuppressWarnings("unused")
	private Integer generateStaffCode(StaffEntity staffEntity) {
		return UUID.randomUUID().hashCode();
	}
	
	default Long generateCodeIfNotExists(Long existingCode) {
		if (existingCode == null || existingCode == 0L) {
			long min = 100_000L;
			long max = 999_999L;
			return min + (long) (Math.random() * (max - min + 1));
		}
		return existingCode;
	}
	
	default UUID generateGuidIfNotExists(UUID existingGuid) {
		if (existingGuid == null) {
			return UUID.randomUUID().randomUUID();
		}
		return existingGuid;
	}
	
	

}
