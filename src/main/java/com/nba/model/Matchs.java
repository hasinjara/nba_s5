package com.nba.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Matchs {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_match", nullable = false, length = -1)
    private String idMatch;
    @Basic
    @Column(name = "date_match", nullable = false)
    private Date dateMatch;
    @Basic
    @Column(name = "temps", nullable = false)
    private Time temps;



    public Matchs(Date dateMatch, Time temps) {
        this.dateMatch = dateMatch;
        this.temps = temps;
    }

    public Matchs() {
    }



    public String getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(String idMatch) {
        this.idMatch = idMatch;
    }

    public Date getDateMatch() {
        return dateMatch;
    }

    public void setDateMatch(Date dateMatch) {
        this.dateMatch = dateMatch;
    }

    public Time getTemps() {
        return temps;
    }

    public void setTemps(Time temps) {
        this.temps = temps;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matchs matchs = (Matchs) o;
        return Objects.equals(idMatch, matchs.idMatch) && Objects.equals(dateMatch, matchs.dateMatch) && Objects.equals(temps, matchs.temps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMatch, dateMatch, temps);
    }
}
