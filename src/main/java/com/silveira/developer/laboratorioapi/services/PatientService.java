package com.silveira.developer.laboratorioapi.services;

import com.silveira.developer.laboratorioapi.models.Patient;

import java.util.List;

public interface PatientService {

    public void create(Patient patient);
    public void update(Patient patient);
    public void delete(Long id);
    public List<Patient> getAll();
    public Patient getById(Long id);
}
