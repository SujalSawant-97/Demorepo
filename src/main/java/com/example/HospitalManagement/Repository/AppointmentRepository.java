package com.example.HospitalManagement.Repository;
import com.example.HospitalManagement.Model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, String> {
    List<Appointment> findByDoctorId(String doctorId); // Find appointments by doctorId
    List<Appointment> findByPatientId(String patientId); // Find appointments by patientId
}
