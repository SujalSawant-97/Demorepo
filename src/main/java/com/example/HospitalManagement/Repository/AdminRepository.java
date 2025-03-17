package com.example.HospitalManagement.Repository;
import com.example.HospitalManagement.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminRepository extends JpaRepository<Admin, String> {
    Admin findByUsername(String username); // Example: Find admin by username
}
