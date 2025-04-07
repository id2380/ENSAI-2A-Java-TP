package fr.ensai.running.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import fr.ensai.running.model.Athlete;
import fr.ensai.running.model.Competition;
import fr.ensai.running.service.AthleteService;
import fr.ensai.running.service.CompetitionService;

@RestController
@RequestMapping("/api")
public class ApiRestController {

    @Autowired
    private AthleteService athleteService;

    @Autowired
    private CompetitionService competitionService;

    // ---------------------- ATHLETES ----------------------

    @GetMapping("/athlete")
    public List<Athlete> allAthletes() {
        return athleteService.findAll();
    }

    @GetMapping("/athlete/{id}")
    public Athlete getAthleteById(@PathVariable Long id) {
        return athleteService.findById(id);
    }

    @DeleteMapping("/athlete/{id}")
    public void deleteAthleteById(@PathVariable Long id) {
        athleteService.deleteById(id);
    }

    @PostMapping("/athlete")
    public Athlete createAthlete(@RequestBody Athlete athlete) {
        return athleteService.save(athlete);
    }

    // ---------------------- COMPETITIONS ----------------------

    @GetMapping("/competition")
    public List<Competition> allCompetitions() {
        return competitionService.findAll();
    }

    @GetMapping("/competition/{id}")
    public Competition getCompetitionById(@PathVariable Long id) {
        return competitionService.findById(id);
    }

    @DeleteMapping("/competition/{id}")
    public void deleteCompetitionById(@PathVariable Long id) {
        competitionService.deleteById(id);
    }
}
