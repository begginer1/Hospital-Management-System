package com.sachinproject.HospitalManagementSystem.service;

import com.sachinproject.HospitalManagementSystem.Entity.Appointment;
import com.sachinproject.HospitalManagementSystem.Entity.Doctor;
import com.sachinproject.HospitalManagementSystem.Entity.Patient;
import com.sachinproject.HospitalManagementSystem.repository.AppointmentRepository;
import com.sachinproject.HospitalManagementSystem.repository.DoctorRepository;
import com.sachinproject.HospitalManagementSystem.repository.PatientRepository;
import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private Doctor doctor;

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Transactional
    public Appointment createNewAppointment(Appointment appointment, Long doctorid, Long patientId) {
        Doctor doctor = doctorRepository.findById(doctorid).orElseThrow();
        Patient patient = patientRepository.findById(patientId).orElseThrow();
        if (appointment.getId() != null) throw new IllegalArgumentException("Appointment should not have");
        appointment.setPatient(patient);
        appointment.setDoctor(doctor);

        patient.getAppointments().add(appointment);
        appointmentRepository.save(appointment);
        return appointment;
    }
}
