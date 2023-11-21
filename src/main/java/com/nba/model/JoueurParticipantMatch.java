package com.nba.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "joueur_participant_match", schema = "public", catalog = "nba")
public class JoueurParticipantMatch {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id_match", nullable = false, length = -1)
    private String idMatch;

    public String getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(String idMatch) {
        this.idMatch = idMatch;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id_joueur", nullable = false, length = -1)
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
        JoueurParticipantMatch that = (JoueurParticipantMatch) o;
        return Objects.equals(idMatch, that.idMatch) && Objects.equals(idJoueur, that.idJoueur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMatch, idJoueur);
    }
}
