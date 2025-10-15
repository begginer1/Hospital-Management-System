package com.sachinproject.HospitalManagementSystem.service;

import com.sachinproject.HospitalManagementSystem.Entity.Patient;
import com.sachinproject.HospitalManagementSystem.repository.PatientRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientService {
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Transactional // for storing in persistient api for using persistent context as catche
    public Patient getPatientByid(Long id) {
        Patient p = patientRepository.findById(id).orElseThrow();
        return p;
    }


}
