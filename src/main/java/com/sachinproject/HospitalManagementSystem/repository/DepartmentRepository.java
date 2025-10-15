package com.sachinproject.HospitalManagementSystem.repository;

import com.sachinproject.HospitalManagementSystem.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}