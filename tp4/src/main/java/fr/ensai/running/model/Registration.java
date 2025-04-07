package fr.ensai.running.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRegistration;

    @ManyToOne
    @JoinColumn(name = "id_athlete")
    private Athlete athlete;

    @ManyToOne
    @JoinColumn(name = "id_competition")
    private Competition competition;

    private LocalDate registrationDate;

    public Registration() {}
}
