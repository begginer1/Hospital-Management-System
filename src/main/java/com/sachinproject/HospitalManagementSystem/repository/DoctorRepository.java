package com.sachinproject.HospitalManagementSystem.repository;

import com.sachinproject.HospitalManagementSystem.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}