package com.example.HospitalManagement.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "patients")
public class Patient {

    @Id
    private String id;
    private String name;
    private String phone;
    private String email;
    // ... other patient details
}
