package com.sachinproject.HospitalManagementSystem;

import com.sachinproject.HospitalManagementSystem.Entity.Appointment;
import com.sachinproject.HospitalManagementSystem.Entity.Patient;
import com.sachinproject.HospitalManagementSystem.Entity.Insurance;
import com.sachinproject.HospitalManagementSystem.repository.PatientRepository;
import com.sachinproject.HospitalManagementSystem.service.AppointmentService;
import com.sachinproject.HospitalManagementSystem.service.InsuranceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class InsuranceTests {

    @Autowired
    private InsuranceService insuranceService;

    @Autowired
    private AppointmentService appointmentService;

    @Test
    public void testInsurance() {

        Insurance insurance = Insurance.builder().policyNumber("HDFC_1234")
                .provider("HDFC")
                .validUntil(LocalDate.of(2030, 12, 12)).build();
    }


}
