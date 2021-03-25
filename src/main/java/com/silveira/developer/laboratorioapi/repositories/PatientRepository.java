package com.silveira.developer.laboratorioapi.repositories;

import com.silveira.developer.laboratorioapi.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
}
