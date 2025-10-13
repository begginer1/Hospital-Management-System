package com.sachinproject.HospitalManagementSystem.Entity;

import com.sachinproject.HospitalManagementSystem.Entity.Type.BloodGroupType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;


import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="patient",uniqueConstraints = {@UniqueConstraint(name="email",columnNames={"email"})})
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="first_name" ,nullable = false)
    private String name;
    @Column(name="birth_Date",nullable = false)
    private LocalDateTime birthdate;
    private String email;
    @Column(name="gender",nullable = false)
    private String Gender;

    @CreationTimestamp // does not work when we initization data
    @Column(name="register_at",updatable = false)
    private LocalDateTime createdAt;

    @Column(name="blood_group" ,nullable = false)
    @Enumerated(EnumType.STRING)
    private BloodGroupType bloodGroup;
    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", email='" + email + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }
}
