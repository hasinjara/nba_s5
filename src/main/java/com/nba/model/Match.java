package com.nba.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.context.annotation.Bean;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.List;


public class Match implements Serializable {

    @JsonProperty("idMatch")
    private String idMatch;

    @JsonProperty("dateMatch")
    private Date dateMatch;

    @JsonProperty("temps")
    private Time temps;

    @JsonProperty("matchsFille")
    List<MatchsFille> matchsFilleList;

    public Match() {
    }

    public Match(String idMatch, Date dateMatch, Time temps, List<MatchsFille> matchsFilleList) {
        this.idMatch = idMatch;
        this.dateMatch = dateMatch;
        this.temps = temps;
        this.matchsFilleList = matchsFilleList;
    }
}
