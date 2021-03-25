package com.silveira.developer.laboratorioapi.controllers;

import com.silveira.developer.laboratorioapi.models.Patient;
import com.silveira.developer.laboratorioapi.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Patient> getAll(){
        return patientService.getAll();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')" )
    public Patient getById(@PathVariable Long id){
        return patientService.getById(id);
    }

    @PostMapping
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')" )
    public void create(@RequestBody Patient patient){
        patientService.create(patient);
    }

    @PutMapping
    @PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')" )
    public void update(@RequestBody Patient patient){
        patientService.update(patient);
    }

    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')" )
    public void update(@PathVariable Long id){
        patientService.delete(id);
    }
}
