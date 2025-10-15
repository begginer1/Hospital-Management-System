package com.sachinproject.HospitalManagementSystem.repository;

import com.sachinproject.HospitalManagementSystem.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}