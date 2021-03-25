package com.silveira.developer.laboratorioapi.repositories;

import com.silveira.developer.laboratorioapi.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    @Query(value = "SELECT * FROM APPOINTMENTS WHERE MEDICAL_ID = ?1", nativeQuery = true)
    public List<Appointment> getAppointmentByMedical(Long id);
    @Query(value = "SELECT * FROM APPOINTMENTS WHERE PATIENT_ID = ?1", nativeQuery = true)
    public List<Appointment> getAppointmentByPatient(Long id);
}
