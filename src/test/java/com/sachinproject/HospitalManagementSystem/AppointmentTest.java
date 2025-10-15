package com.sachinproject.HospitalManagementSystem;

import com.sachinproject.HospitalManagementSystem.Entity.Appointment;
import com.sachinproject.HospitalManagementSystem.service.AppointmentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class AppointmentTest {
    @Autowired
    private AppointmentService appointmentService;

    @Test
    public void testCreateAppointment() {
        Appointment appointment = Appointment.builder().appointmentTime(
                        LocalDateTime.of(2025, 11, 1, 14, 5, 0))
                .reason("cancer")
                .build();
        var appointment1p = appointmentService.createNewAppointment(appointment, 1L, 2L);
        System.out.println(appointment1p);
    }


    @Test
    public void testReassignAppointments() {
        Appointment appointment = Appointment.builder().appointmentTime(
                        LocalDateTime.of(2025, 11, 1, 14, 5, 0))
                .reason("cancer")
                .status("Assigned")
                .build();
        var appointment1p = appointmentService.createNewAppointment(appointment, 1L, 2L);
        appointmentService.reAssignAppointmentToAnotherDoctor(1L, 3L);
    }


}
