package com.staff.manage.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.staff.manage.entity.StaffEntity;

@Repository
public interface StaffRepository extends JpaRepository<StaffEntity, UUID> {
	Optional<StaffEntity> findByFirstName(String firstName);
}
