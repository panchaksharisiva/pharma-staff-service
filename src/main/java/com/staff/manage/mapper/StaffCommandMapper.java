package com.staff.manage.mapper;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.staff.manage.dto.AddressDto;
import com.staff.manage.dto.ContactDto;
import com.staff.manage.dto.StaffDto;
import com.staff.manage.entity.AddressEntity;
import com.staff.manage.entity.ContactEntity;
import com.staff.manage.entity.StaffEntity;

@Component
public class StaffCommandMapper {

	StaffMapper staffMapper;

	@Autowired
	public StaffCommandMapper(StaffMapper staffMapper) {
		this.staffMapper = staffMapper;
	}

	// dto to entity================================================

	public StaffEntity dtoToStaffEntity(StaffDto staffDto) {
		if(staffDto.getStaffGuid()==null || staffDto.getStaffGuid().toString().length()==0) {
			staffDto.setStaffGuid(UUID.randomUUID());
		}
		StaffEntity staffEntity = staffMapper.dtoToStaffEntity(staffDto);
		staffEntity.setAddressEntity(dtoToAddressEntity(staffDto.getAddressDto(),staffEntity));
		staffEntity.setContactEntities(dtoToContactEntities(staffDto.getContactDtos(), staffEntity));
		return staffEntity;
	}

	public AddressEntity dtoToAddressEntity(AddressDto addressDto, StaffEntity staffEntity) {
		if(addressDto.getAddressGuid()==null || addressDto.getAddressGuid().toString().length()==0) {
			addressDto.setAddressGuid(UUID.randomUUID());
		}
		AddressEntity addressEntity = staffMapper.dtoToAddressEntity(addressDto);
		addressEntity.setStaffEntity(staffEntity);
		return addressEntity;
	}

	public ContactEntity dtoToContactEntity(ContactDto contactDto, StaffEntity staffEntity) {
		if(contactDto.getContactGuid()==null || contactDto.getContactGuid().toString().length()==0) {
			contactDto.setContactGuid(UUID.randomUUID());
		}
		ContactEntity contactEntity = staffMapper.dtoToContactEntity(contactDto);
		contactEntity.setStaffEntity(staffEntity);
		return contactEntity;
	}

	public List<ContactEntity> dtoToContactEntities(List<ContactDto> contactDtos, StaffEntity staffEntity) {
		return contactDtos.stream().map(contactEntity -> dtoToContactEntity(contactEntity, staffEntity))
				.collect(Collectors.toList());

	}

	// entity to dto=============================================================

	public StaffDto entityToStaffDto(StaffEntity staffEntity) {
		var staffDto = staffMapper.entityToStaffDto(staffEntity);
		staffDto.setAddressDto(entityToAddressDto(staffEntity.getAddressEntity()));
		staffDto.setContactDtos(entityToContactDtos(staffEntity.getContactEntities(), staffEntity));
		return staffDto;
	}

	public AddressDto entityToAddressDto(AddressEntity addressEntity) {
		var addressDto = staffMapper.entityToAddressDto(addressEntity);
		return addressDto;
	}

	public ContactDto entityToContactDto(ContactEntity contactEntity) {
		var contactDto = staffMapper.entityToContactDto(contactEntity);
		return contactDto;
	}

	public List<ContactDto> entityToContactDtos(List<ContactEntity> contactEntities, StaffEntity staffEntity) {
		return contactEntities.stream().map(contactEntity -> entityToContactDto(contactEntity))
				.collect(Collectors.toList());

	}

}
