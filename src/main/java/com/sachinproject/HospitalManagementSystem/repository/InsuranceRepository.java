package com.sachinproject.HospitalManagementSystem.repository;

import com.sachinproject.HospitalManagementSystem.Entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}