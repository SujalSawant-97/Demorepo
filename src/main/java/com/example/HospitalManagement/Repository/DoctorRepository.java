package com.example.HospitalManagement.Repository;
import com.example.HospitalManagement.Model.Doctor;

import org.springframework.data.jpa.repository.JpaRepository;


public interface DoctorRepository extends JpaRepository<Doctor, String> {
    // You can add custom query methods if needed
}
