package com.staff.manage.service;

import java.util.UUID;

import com.staff.manage.dto.StaffDto;

public interface StaffService {

	public void createStaff(StaffDto staffDto);

	public void updateStaff(StaffDto staffDto);

	public void deleteStaff(UUID staffGuid);

	public StaffDto findByStaffGuid(UUID staffGuid);
	
	public StaffDto findByFirstName(String firstName);
}
