package com.nba.controller;

import com.nba.model.Retour;
import com.nba.service.EquipeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipe")
public class EquipeController {

    private final EquipeService equipeService;

    public EquipeController(EquipeService equipeService) {
        this.equipeService = equipeService;
    }

    @GetMapping("")
    public Retour all() {
        Retour r = new Retour();
        try {
            r = new Retour("aucun", equipeService.all_equipe());
        }
        catch (Exception e) {
            r = new Retour(e.getMessage(), null);
        }
        return  r;
    }

}
