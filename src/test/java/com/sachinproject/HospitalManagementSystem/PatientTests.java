package com.sachinproject.HospitalManagementSystem;

import com.sachinproject.HospitalManagementSystem.Entity.Patient;
import com.sachinproject.HospitalManagementSystem.repository.PatientRepository;
import com.sachinproject.HospitalManagementSystem.service.InsuranceService;
import com.sachinproject.HospitalManagementSystem.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientTests {

    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private PatientService patientService;

    @Autowired
    private InsuranceService insuranceService;

    @Test
    public void testPatientRepository() {
        List<Patient> listofPatients = patientRepository.findAll();
        for (Patient p : listofPatients)
            System.out.println(p);
    }

    @Test
    public void testPatientService() {
        Patient p = patientService.getPatientByid(3L);
        System.out.println(p);
    }


    @Test
    public void findByName() {
        Patient p = patientRepository.findByName("Sachin");
        System.out.println(p);
    }

    @Test
    public void testIInsuranceRemoval() {
        insuranceService.dissassociationInsurancefromPatient(1L);
    }
}
