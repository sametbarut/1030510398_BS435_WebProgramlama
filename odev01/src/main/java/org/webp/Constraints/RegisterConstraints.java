package org.webp.Constraints;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;



@Entity

public class RegisterConstraints {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Size(min = 2 , max = 128)
    private String name;

    @NotBlank
    @Size(min = 2 , max = 128)
    private String surname;

    @Past
    @NotNull
    private LocalDate dateOfRegistration;



}
