package com.sachinproject.HospitalManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private LocalDateTime appointmentTime;

    @Column(length = 100)
    private String reason;

    private String status;


    @JoinColumn(unique = true,updatable = false)
    @ManyToOne
    Patient patient;

    @ManyToOne
    @JoinColumn(nullable = false)
    Doctor doctor;
}
