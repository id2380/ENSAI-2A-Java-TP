package fr.ensai.running.repository;

import fr.ensai.running.model.Registration;
import fr.ensai.running.model.Athlete;
import fr.ensai.running.model.Competition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegistrationRepository extends CrudRepository<Registration, Long> {

    // ✅ Trouve une inscription à partir de l'athlète et de la compétition
    Optional<Registration> findByAthleteAndCompetition(Athlete athlete, Competition competition);
}
