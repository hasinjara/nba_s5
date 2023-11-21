/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nba.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import jakarta.persistence.*;
/**
 *
 * @author hasinjara
 */
@Entity
@Table(name = "joueur")
public class Joueur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_joueur")
    private String idJoueur;
    @Column(name = "nom")
    private String nom;
    @Column(name = "dtn")
    @Temporal(TemporalType.DATE)
    private Date dtn;
    @Column(name = "chemin")
    private String chemin;
    @JoinTable(name = "joueur_participant_match", joinColumns = {
        @JoinColumn(name = "id_joueur", referencedColumnName = "id_joueur")}, inverseJoinColumns = {
        @JoinColumn(name = "id_match", referencedColumnName = "id_match")})
    @ManyToMany
    private List<Matchs> matchsList;
    @OneToMany(mappedBy = "idJoueur")
    private List<Contrat> contratList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJoueur")
    private List<ActionMatchJoueur> actionMatchJoueurList;

    public Joueur() {
    }

    public Joueur(String idJoueur) {
        this.idJoueur = idJoueur;
    }

    public String getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(String idJoueur) {
        this.idJoueur = idJoueur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDtn() {
        return dtn;
    }

    public void setDtn(Date dtn) {
        this.dtn = dtn;
    }

    public String getChemin() {
        return chemin;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    public List<Matchs> getMatchsList() {
        return matchsList;
    }

    public void setMatchsList(List<Matchs> matchsList) {
        this.matchsList = matchsList;
    }

    public List<Contrat> getContratList() {
        return contratList;
    }

    public void setContratList(List<Contrat> contratList) {
        this.contratList = contratList;
    }

    public List<ActionMatchJoueur> getActionMatchJoueurList() {
        return actionMatchJoueurList;
    }

    public void setActionMatchJoueurList(List<ActionMatchJoueur> actionMatchJoueurList) {
        this.actionMatchJoueurList = actionMatchJoueurList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJoueur != null ? idJoueur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Joueur)) {
            return false;
        }
        Joueur other = (Joueur) object;
        if ((this.idJoueur == null && other.idJoueur != null) || (this.idJoueur != null && !this.idJoueur.equals(other.idJoueur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "nbaclasses.Joueur[ idJoueur=" + idJoueur + " ]";
    }
    
}
