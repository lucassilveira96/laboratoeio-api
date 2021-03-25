package com.silveira.developer.laboratorioapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 20)
    private String firstname;

    @NotBlank
    @Size(max = 50)
    private String lastname;


    private Date birthdate;

    @NotBlank
    @Size(max = 13)
    private String telephone;

    @NotBlank
    @Size(max = 150)
    private String address;

    @NotBlank
    @Size(max = 30)
    private String district;

    @NotBlank
    @Size(max = 50)
    private String number;

    @NotBlank
    @Size(max = 2)
    private String state;

    @NotBlank
    @Size(max = 100)
    private String city;

    private String complement;


}
