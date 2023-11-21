package com.nba.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
public class Joueur {
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

    @Basic
    @Column(name = "nom", nullable = true, length = 50)
    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "dtn", nullable = true)
    private Date dtn;

    public Date getDtn() {
        return dtn;
    }

    public void setDtn(Date dtn) {
        this.dtn = dtn;
    }

    @Basic
    @Column(name = "chemin", nullable = true, length = -1)
    private String chemin;

    public String getChemin() {
        return chemin;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Joueur joueur = (Joueur) o;
        return Objects.equals(idJoueur, joueur.idJoueur) && Objects.equals(nom, joueur.nom) && Objects.equals(dtn, joueur.dtn) && Objects.equals(chemin, joueur.chemin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idJoueur, nom, dtn, chemin);
    }
}
