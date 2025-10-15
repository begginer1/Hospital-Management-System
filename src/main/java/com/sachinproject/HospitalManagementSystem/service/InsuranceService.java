package com.sachinproject.HospitalManagementSystem.service;

import com.sachinproject.HospitalManagementSystem.Entity.Patient;
import com.sachinproject.HospitalManagementSystem.Entity.Insurance;
import com.sachinproject.HospitalManagementSystem.repository.InsuranceRepository;
import com.sachinproject.HospitalManagementSystem.repository.PatientRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class InsuranceService {
    private InsuranceRepository insuranceRepository;
    private PatientRepository patientRepository;

    public InsuranceService(InsuranceRepository insuranceRepository, PatientRepository patientRepository) {
        this.insuranceRepository = insuranceRepository;
        this.patientRepository = patientRepository;
    }

    public Patient assignInsuranceToPatient(Insurance insurnace, Long patientId) {
        Patient patient = patientRepository.findById(patientId).orElseThrow(() -> new EntityNotFoundException("No Patient found"));

        patient.setInsurance(insurnace);
        insurnace.setPatient(patient);
        return patient;
    }
}
