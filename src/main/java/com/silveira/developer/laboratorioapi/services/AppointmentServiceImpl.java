package com.silveira.developer.laboratorioapi.services;

import com.silveira.developer.laboratorioapi.models.Appointment;
import com.silveira.developer.laboratorioapi.repositories.AppointmentRepository;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class AppointmentServiceImpl implements AppointmentService{

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public void create(Appointment appointment) {
        appointmentRepository.save(appointment);
    }

    @Override
    public void update(Appointment appointment) {
        create(appointment);
    }

    @Override
    public void delete(Long id) {
        appointmentRepository.deleteById(id);
    }

    @Override
    public Appointment getById(Long id) {
        return appointmentRepository.findById(id).get();
    }

    @Override
    public List<Appointment> getAll() {
        return appointmentRepository.findAll();
    }

    @Override
    public List<Appointment> getAppointmentByMedical(Long id) {
        return appointmentRepository.getAppointmentByMedical(id);
    }

    @Override
    public List<Appointment> getAppointmentByPatient(Long id) {
        return appointmentRepository.getAppointmentByPatient(id);
    }

}
