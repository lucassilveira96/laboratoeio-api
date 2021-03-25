package com.silveira.developer.laboratorioapi.controllers;

import com.silveira.developer.laboratorioapi.models.Appointment;
import com.silveira.developer.laboratorioapi.services.AppointmentService;
import com.silveira.developer.laboratorioapi.services.AppointmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/appointment")
public class AppointmentController {
    @Autowired
    AppointmentServiceImpl appointmentService;

    @PostMapping
    @PreAuthorize("hasRole('ADMIN') or hasRole('MODERATOR')")
    public void create(@RequestBody Appointment appointment){
        appointmentService.create(appointment);
    }

    @PutMapping
    @PreAuthorize("hasRole('ADMIN') or hasRole('MODERATOR')")
    public void update(@RequestBody Appointment appointment){
        appointmentService.update(appointment);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN') or hasRole('MODERATOR')")
    public void delete(@PathVariable Long id){
        appointmentService.delete(id);
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN') or hasRole('MODERATOR') or hasRole('USER')")
    public List<Appointment> getAll(){
        return appointmentService.getAll();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN') or hasRole('MODERATOR') or hasRole('USER')")
    public Appointment getById(@PathVariable Long id){
        return appointmentService.getById(id);
    }

    @GetMapping("/medical/{id}")
    @PreAuthorize("hasRole('ADMIN') or hasRole('MODERATOR') or hasRole('USER')")
    public List<Appointment> getAppointmentByMedical(@PathVariable Long id){
        return appointmentService.getAppointmentByMedical(id);
    }

    @GetMapping("/patient/{id}")
    @PreAuthorize("hasRole('ADMIN') or hasRole('MODERATOR') or hasRole('USER')")
    public List<Appointment> getAppointmentByPatient(@PathVariable Long id){
        return appointmentService.getAppointmentByPatient(id);
    }
}
