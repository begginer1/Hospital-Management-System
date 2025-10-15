package com.sachinproject.HospitalManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;

import javax.print.Doc;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@ToString(exclude = "departments")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String specialization;

    @Column(unique = true, nullable = false)
    private String email;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @ManyToMany(mappedBy = "doctors", fetch = FetchType.EAGER)

    private Set<Department> departments = new HashSet<>();
}
