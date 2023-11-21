package com.nba.controller;

import com.nba.model.Action;
import com.nba.model.Retour;
import com.nba.service.ActionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/action")
public class ActionController {
    private  final ActionService actionService;

    public  ActionController(ActionService as) {
        this.actionService = as;
    }

//    @GetMapping("/")
//    public List<Action> read() {
//        return actionService.allAction();
//    }

    @GetMapping("")
    public Retour a() {
        Retour r = new Retour();
        try {
            r = new Retour("aucun", actionService.allAction());
        }
        catch (Exception e) {
            r = new Retour(e.getMessage(), null);
        }
        return  r;
    }

}
