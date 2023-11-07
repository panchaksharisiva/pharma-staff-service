package com.staff.manage.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.staff.manage.dto.StaffDto;
import com.staff.manage.service.StaffService;


@RestController
@RequestMapping("/api/v1/staff")
public class StaffController {

	StaffService staffService;

	public StaffController(StaffService staffService) {
		this.staffService = staffService;
	}

	@PostMapping("/create")
	public void createStaff(@RequestBody StaffDto staffDto) {
		staffService.createStaff(staffDto);
	}

	@PostMapping("/update")
	public void updateStaff(@RequestBody StaffDto staffDto) {
		staffService.updateStaff(staffDto);
	}

	@DeleteMapping("/deleteByStaffGuid/{staffGuid}")
	public void deleteStaff(@RequestParam UUID StaffGuid) {
		staffService.deleteStaff(StaffGuid);
	}

	@GetMapping("/findbyGuid/{staffGuid}")
	public StaffDto findByStaffGuid(@PathVariable UUID staffGuid) {
		return staffService.findByStaffGuid(staffGuid);
	}

	@GetMapping("/findByName/{FirstName}")
	public StaffDto findByFirstName(@PathVariable String FirstName) {
		return staffService.findByFirstName(FirstName);
	}

}
