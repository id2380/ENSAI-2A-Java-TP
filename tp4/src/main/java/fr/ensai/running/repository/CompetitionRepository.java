package fr.ensai.running.repository;

import fr.ensai.running.model.Competition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitionRepository extends CrudRepository<Competition, Long> {
}
