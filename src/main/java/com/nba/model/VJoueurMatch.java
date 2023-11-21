package com.nba.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "v_joueur_match", schema = "public", catalog = "nba")
public class VJoueurMatch {

    @Id
    @Basic
    @Column(name = "id_match", nullable = true, length = -1)
    private String idMatch;
    @Basic
    @Column(name = "id_equipe", nullable = true, length = -1)
    private String idEquipe;
    @Basic
    @Column(name = "equipe", nullable = true, length = 50)
    private String equipe;
    @Basic
    @Column(name = "id_joueur", nullable = true, length = -1)
    private String idJoueur;
    @Basic
    @Column(name = "joueur", nullable = true, length = 50)
    private String joueur;
    @Basic
    @Column(name = "numero_joueur", nullable = true)
    private Integer numeroJoueur;

    public String getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(String idMatch) {
        this.idMatch = idMatch;
    }

    public String getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(String idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public String getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(String idJoueur) {
        this.idJoueur = idJoueur;
    }

    public String getJoueur() {
        return joueur;
    }

    public void setJoueur(String joueur) {
        this.joueur = joueur;
    }

    public Integer getNumeroJoueur() {
        return numeroJoueur;
    }

    public void setNumeroJoueur(Integer numeroJoueur) {
        this.numeroJoueur = numeroJoueur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VJoueurMatch that = (VJoueurMatch) o;
        return Objects.equals(idMatch, that.idMatch) && Objects.equals(idEquipe, that.idEquipe) && Objects.equals(equipe, that.equipe) && Objects.equals(idJoueur, that.idJoueur) && Objects.equals(joueur, that.joueur) && Objects.equals(numeroJoueur, that.numeroJoueur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMatch, idEquipe, equipe, idJoueur, joueur, numeroJoueur);
    }
}
