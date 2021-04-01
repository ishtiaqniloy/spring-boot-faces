package com.example.JsfDemo.model;

import com.example.JsfDemo.model.enums.BloodGroup;
import com.example.JsfDemo.model.enums.Gender;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(max = 60)
    @NotBlank
    private String firstName;

    @Size(max = 20)
    @NotBlank
    private String lastName;

    @Transient
    private String fullName;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date birthDate;

    private Boolean active;

    @Enumerated(EnumType.STRING)
    private BloodGroup bloodGroup;

}

