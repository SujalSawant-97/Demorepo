package com.example.HospitalManagement.Repository;
import com.example.HospitalManagement.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PatientRepository extends JpaRepository<Patient, String> {
    // You can add custom query methods if needed
}
