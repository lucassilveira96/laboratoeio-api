package com.silveira.developer.laboratorioapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amountpayable;

    @NotBlank
    @Size(max = 100)
    private String observation;


    private LocalDate appointment_date;


    private LocalTime appointment_time;

    @ManyToOne
    @JoinColumn(name="medical_id")
    private User medical;

    @ManyToOne
    @JoinColumn(name="patient_id")
    private Patient patient;

}
