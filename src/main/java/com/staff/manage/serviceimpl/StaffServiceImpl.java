package com.staff.manage.serviceimpl;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staff.manage.dto.StaffDto;
import com.staff.manage.entity.StaffEntity;
import com.staff.manage.mapper.StaffCommandMapper;
import com.staff.manage.repository.StaffRepository;
import com.staff.manage.service.StaffService;

@Service
public class StaffServiceImpl implements StaffService {

	StaffRepository staffRepository;

	StaffCommandMapper staffCommandMapper;

	@Autowired
	public StaffServiceImpl(StaffRepository staffRepository, StaffCommandMapper staffCommandMapper) {
		this.staffRepository = staffRepository;
		this.staffCommandMapper = staffCommandMapper;
	}

	@Override
	public void createStaff(StaffDto staffDto) {
		staffRepository.save(staffCommandMapper.dtoToStaffEntity(staffDto));
	}

	@Override
	public void updateStaff(StaffDto staffDto) {
		staffRepository.save(staffCommandMapper.dtoToStaffEntity(staffDto));
	}

	@Override
	public void deleteStaff(UUID staffGuid) {
		Optional<StaffEntity> staffEntity = staffRepository.findById(staffGuid);
		if (staffEntity.isPresent()) {
			staffRepository.delete(staffEntity.get());
		} else {
			throw new RuntimeException("invalid staff code");
		}
	}

	@Override
	public StaffDto findByStaffGuid(UUID staffGuid) {
		Optional<StaffEntity> staffOptionalEntity = staffRepository.findById(staffGuid);
		if (staffOptionalEntity.isPresent()) {
			return staffCommandMapper.entityToStaffDto(staffOptionalEntity.get());
		} else {
			throw new RuntimeException("Staff not found with given staffGuid");
		}
	}

	public StaffDto findByFirstName(String firstName) {
		StaffEntity staffEntity = staffRepository.findByFirstName(firstName)
				.orElseThrow(() -> new RuntimeException("Staff not found"));
		return staffCommandMapper.entityToStaffDto(staffEntity);
	}

}