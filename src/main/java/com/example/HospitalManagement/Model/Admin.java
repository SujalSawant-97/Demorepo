package com.example.HospitalManagement.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.Data;



@Entity
@Table(name = "admins") // MongoDB collection name\
@Data
public class Admin {
    @Id
    private String id;
    private String username;
    private String password; // In real app, encrypt this! For now, simple.
}
