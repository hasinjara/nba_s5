package com.nba.controller;

import com.nba.model.Retour;
import com.nba.repository.JoueurRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/joueur")
public class JoueurController {

    private final JoueurRepository joueurRepository;


    public JoueurController(JoueurRepository joueurRepository) {
        this.joueurRepository = joueurRepository;
    }

    @GetMapping("")
    public Retour all() {
        Retour r = new Retour();
        try {
            r = new Retour("aucun", joueurRepository.findAll());
        }
        catch (Exception e) {
            r = new Retour(e.getMessage(), null);
        }
        return  r;
    }
}
