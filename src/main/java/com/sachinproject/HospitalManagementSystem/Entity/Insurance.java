package com.sachinproject.HospitalManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@Table(name = "insurance")
@Builder
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String policyNumber;

    @Column(nullable = false, length = 100)
    private String provider;

    @Column(nullable = false)
    private LocalDate validUntil;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDate createdAt;

    @OneToOne(mappedBy = "insurance")
    @JoinColumn(nullable = false)
    private Patient patient;


    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Insurance(String policyNumber, String provider, LocalDate validUntil) {
        this.provider = provider;
        this.policyNumber = policyNumber;
        this.validUntil = validUntil;

    }

    public Insurance() {

    }

    public Insurance(Long id, String policyNumber, String provider, LocalDate validUntil, LocalDate createdAt, Patient patient) {
        this.id = id;
        this.policyNumber = policyNumber;
        this.provider = provider;
        this.validUntil = validUntil;
        this.createdAt = createdAt;
        this.patient = patient;
    }
}
