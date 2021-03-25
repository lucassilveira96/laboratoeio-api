package com.silveira.developer.laboratorioapi.services;

import com.silveira.developer.laboratorioapi.models.Appointment;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface AppointmentService {
    public void create(Appointment appointment);
    public void update(Appointment appointment);
    public void delete(Long id);
    public Appointment getById(Long id);
    public List<Appointment> getAll();
    public List<Appointment> getAppointmentByMedical(Long id);
    public List<Appointment> getAppointmentByPatient(Long id);
}
