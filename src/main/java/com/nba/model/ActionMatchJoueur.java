package com.nba.model;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "action_match_joueur", schema = "public", catalog = "nba")
public class ActionMatchJoueur {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id_a_m_j", nullable = false, length = -1)
    private String idAMJ;

    public String getIdAMJ() {
        return idAMJ;
    }

    public void setIdAMJ(String idAMJ) {
        this.idAMJ = idAMJ;
    }

    @Basic
    @Column(name = "point", nullable = true, precision = 0)
    private Double point;

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    @Basic
    @Column(name = "temps", nullable = true)
    private Time temps;

    public Time getTemps() {
        return temps;
    }

    public void setTemps(Time temps) {
        this.temps = temps;
    }

    @Basic
    @Column(name = "id_action", nullable = false, length = -1)
    private String idAction;

    public String getIdAction() {
        return idAction;
    }

    public void setIdAction(String idAction) {
        this.idAction = idAction;
    }

    @Basic
    @Column(name = "id_match", nullable = false, length = -1)
    private String idMatch;

    public String getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(String idMatch) {
        this.idMatch = idMatch;
    }

    @Basic
    @Column(name = "id_joueur", nullable = false, length = -1)
    private String idJoueur;

    public String getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(String idJoueur) {
        this.idJoueur = idJoueur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActionMatchJoueur that = (ActionMatchJoueur) o;
        return Objects.equals(idAMJ, that.idAMJ) && Objects.equals(point, that.point) && Objects.equals(temps, that.temps) && Objects.equals(idAction, that.idAction) && Objects.equals(idMatch, that.idMatch) && Objects.equals(idJoueur, that.idJoueur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAMJ, point, temps, idAction, idMatch, idJoueur);
    }
}
