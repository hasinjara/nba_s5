package com.nba.controller;
import com.nba.model.Match;
import com.nba.model.Matchs;
import com.nba.model.MatchsFille;
import com.nba.model.Retour;
import com.nba.repository.MatchsFilleRepository;
import com.nba.repository.MatchsRepository;
import com.nba.repository.VJoueurMatchRepository;
import com.nba.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/matchs")
public class MatchsController {

    private final MatchsFilleRepository matchsFilleRepository;
    private final MatchsRepository matchsRepository;

    private final MatchService matchService;

    private final VJoueurMatchRepository vJoueurMatchRepository;

//    public MatchsController(MatchsFilleRepository matchsFilleRepository, MatchsRepository matchsRepository) {
//        this.matchsFilleRepository = matchsFilleRepository;
//        this.matchsRepository = matchsRepository;
//    }


    public MatchsController(MatchsFilleRepository matchsFilleRepository, MatchsRepository matchsRepository, MatchService matchService, VJoueurMatchRepository vJoueurMatchRepository) {
        this.matchsFilleRepository = matchsFilleRepository;
        this.matchsRepository = matchsRepository;
        this.matchService = matchService;
        this.vJoueurMatchRepository = vJoueurMatchRepository;
    }

    @GetMapping("")
    public  Retour all_match(){
        Retour r = new Retour();
        try {
            List<Matchs> allMatchs = matchsRepository.findAll();
            List<Match> depl = new ArrayList<Match>();
            Match m = new Match();
            for( Matchs mm : allMatchs  ) {
                m = new Match(mm.getIdMatch(), mm.getDateMatch(), mm.getTemps(), matchsFilleRepository.findMatchsFilleByIdMatch(mm.getIdMatch())  );
                depl.add(m);
            }
            r = new Retour("aucun", depl);
        }
        catch (Exception e) {
            r = new Retour(e.getMessage(), null);
        }
        return  r;
    }

    @GetMapping("/details/{id_match}")
    public  Retour detail_match(@PathVariable String id_match ){
        Retour r = new Retour();
        try {
            r = new Retour("aucun", vJoueurMatchRepository.findByIdMatch(id_match) );
        }
        catch (Exception e) {
            r = new Retour(e.getMessage(), null);
        }
        return  r;
    }

    @PostMapping("/{date}/{heure_debut}/{equipe1}/{equipe2}")
    public Retour new_match(@PathVariable Date date, @PathVariable Time heure_debut, @PathVariable String equipe1, @PathVariable String equipe2) {
        Retour r = new Retour();
        try {
            Matchs match = new Matchs(date, heure_debut);
            matchsRepository.save(match);
            Matchs last = matchService.getLast();
            if(last == null) {
                return new Retour("Erreur", null);
            }

            MatchsFille mf1 = new MatchsFille(last.getIdMatch(), equipe1);
            MatchsFille mf2 =  new MatchsFille(last.getIdMatch(), equipe2);
            matchsFilleRepository.save(mf1);
            matchsFilleRepository.save(mf2);
        }
        catch (Exception e) {
            r = new Retour(e.getMessage(), null);
        }
        return  r;
    }


}
