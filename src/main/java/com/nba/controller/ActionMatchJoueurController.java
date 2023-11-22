package com.nba.controller;

import com.nba.model.ActionMatchJoueur;
import com.nba.model.Retour;
import com.nba.repository.ActionMatchJoueurRepository;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.Time;

@RestController
@RequestMapping("/amj")
public class ActionMatchJoueurController {

    private final ActionMatchJoueurRepository actionMatchJoueurRepository;

    public ActionMatchJoueurController(ActionMatchJoueurRepository actionMatchJoueurRepository) {
        this.actionMatchJoueurRepository = actionMatchJoueurRepository;
    }

    @PostMapping("/{point}/{idAction}/{idMatch}/{idJoueur}")
    public Retour ajout(@PathVariable Double point, @PathVariable String idAction, @PathVariable String idMatch, @PathVariable String idJoueur) {
        Retour r = new Retour();
        try {

            ActionMatchJoueur ajm = new ActionMatchJoueur( point, idAction, idMatch,  idJoueur);

            r = new Retour("aucun", actionMatchJoueurRepository.save(ajm) );
        }
        catch (Exception e) {
            r = new Retour(e.getMessage(), null);
        }
        return  r;
    }

    @GetMapping("")
    public Retour read() {
        Retour r = new Retour();
        try {
            //ActionMatchJoueur ajm = new ActionMatchJoueur( point, idAction, idMatch,  idJoueur);

            r = new Retour("aucun", actionMatchJoueurRepository.findAll() );
        }
        catch (Exception e) {
            r = new Retour(e.getMessage(), null);
        }
        return  r;
    }

}
