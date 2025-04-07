package fr.ensai.running.controller;

import fr.ensai.running.model.Competition;
import fr.ensai.running.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CompetitionController {

    @Autowired
    private CompetitionService competitionService;

    @GetMapping("/competition")
    public String allCompetitions(Model model) {
        List<Competition> competitions = competitionService.findAll();
        model.addAttribute("competitions", competitions);
        return "allCompetitions";
    }

    @GetMapping("/competition/delete/{id}")
    public String deleteCompetition(@PathVariable Long id) {
        competitionService.deleteById(id);
        return "redirect:/competition";
    }
}
