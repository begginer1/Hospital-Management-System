package com.sachinproject.HospitalManagementSystem.Entity;

import com.sachinproject.HospitalManagementSystem.Entity.Type.BloodGroupType;
import com.sachinproject.HospitalManagementSystem.Entity.Type.Insurance;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;


import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString

@Table(name="patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="first_name" ,nullable = false)
    private String name;

    @Column(name="birth_Date",nullable = false)
    private LocalDateTime birthdate;

    @Column(unique = true)
    private String email;

    @Column(name="gender",nullable = false)
    private String Gender;

    @CreationTimestamp // does not work when we initization data
    @Column(name="register_at",updatable = false)
    private LocalDateTime createdAt;

    @Column(name="blood_group" ,nullable = false)
    @Enumerated(EnumType.STRING)
    private BloodGroupType bloodGroup;
    @OneToOne
    @JoinColumn(name = "patient_insurance_id")
    private Insurance insurance;

    @OneToMany(mappedBy = "patient" ,cascade = CascadeType.ALL)
    private List<Appointment> appointments = new ArrayList<>();
}
