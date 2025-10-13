package com.sachinproject.HospitalManagementSystem.repository;

import com.sachinproject.HospitalManagementSystem.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByName(String name);

}
