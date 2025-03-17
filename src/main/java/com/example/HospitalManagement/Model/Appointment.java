
package com.example.HospitalManagement.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;


import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String patientId; // Reference to Patient (you might populate this later)
    private String doctorId;  // Reference to Doctor
    private LocalDateTime appointmentDateTime;
    private String status; // e.g., "Pending", "Confirmed", "Cancelled"
    private String patientName; // Added patient's name
    private String patientPhone; // Added patient's phone number
    private String patientEmail; // Added patient's email

    // Getters
    public Long getId() { return id; }
    public String getPatientId() { return patientId; }
    public String getDoctorId() { return doctorId; }
    public LocalDateTime getAppointmentDateTime() { return appointmentDateTime; }
    public String getStatus() { return status; }
    public String getPatientName() { return patientName; }
    public String getPatientPhone() { return patientPhone; }
    public String getPatientEmail() { return patientEmail; }

    // Setters
    public void setPatientId(String patientId) { this.patientId = patientId; }
    public void setDoctorId(String doctorId) { this.doctorId = doctorId; }
    public void setAppointmentDateTime(LocalDateTime appointmentDateTime) { this.appointmentDateTime = appointmentDateTime; }
    public void setStatus(String status) { this.status = status; }
    public void setPatientName(String patientName) { this.patientName = patientName; }
    public void setPatientPhone(String patientPhone) { this.patientPhone = patientPhone; }
    public void setPatientEmail(String patientEmail) { this.patientEmail = patientEmail; }
}