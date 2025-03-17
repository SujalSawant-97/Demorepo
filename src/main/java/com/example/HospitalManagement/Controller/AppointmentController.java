package com.example.HospitalManagement.Controller;

import com.example.HospitalManagement.Model.Appointment;
import com.example.HospitalManagement.Service.AppointmentService;
import org.slf4j.Logger; // Import the Logger interface
import org.slf4j.LoggerFactory; // Import the LoggerFactory
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus; // Import HttpStatus
import org.springframework.http.ResponseEntity; // Import ResponseEntity
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    private static final Logger logger = LoggerFactory.getLogger(AppointmentController.class); // Initialize Logger

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/create")
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        logger.info("Received POST request to /api/appointments/create with data: {}", appointment); // Add logging
        return appointmentService.createAppointment(appointment);
    }

    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable String id) {
        return appointmentService.getAppointmentById(id);
    }

    @GetMapping("/doctor/{doctorId}")
    public List<Appointment> getAppointmentsByDoctorId(@PathVariable String doctorId) {
        return appointmentService.getAppointmentsByDoctorId(doctorId);
    }

    @GetMapping("/patient/{patientId}")
    public List<Appointment> getAppointmentsByPatientId(@PathVariable String patientId) {
        return appointmentService.getAppointmentsByPatientId(patientId);
    }

    @GetMapping("/all")
    public List<Appointment> getAllAppointments() {
        return appointmentService.getAllAppointments();
    }

    @PutMapping("/{id}/status")
    @ResponseBody // Add this annotation
    public ResponseEntity<Appointment> updateAppointmentStatus(@PathVariable String id, @RequestParam String status) {
        logger.info("Received PUT request to /api/appointments/{}/status with id: {} and status: {}", id, id, status); // Added log
        Appointment updatedAppointment = appointmentService.updateAppointmentStatus(id, status);
        if (updatedAppointment != null) {
            return new ResponseEntity<>(updatedAppointment, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}