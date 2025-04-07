package fr.ensai.running.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompetition;

    private String designation;
    private String city;
    private LocalDate eventDate;
    private float distance;
    private int maxAthletes;

    // Constructeur vide requis par JPA
    public Competition() {}
}
