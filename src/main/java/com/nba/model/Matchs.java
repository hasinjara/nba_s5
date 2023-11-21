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
@Table(name = "matchs")
public class Matchs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_match")
    private String idMatch;
    @Basic(optional = false)
    @Column(name = "date_match")
    @Temporal(TemporalType.DATE)
    private Date dateMatch;
    @Basic(optional = false)
    @Column(name = "temps")
    @Temporal(TemporalType.TIME)
    private Date temps;
    @ManyToMany(mappedBy = "matchsList")
    private List<Joueur> joueurList;
    @ManyToMany(mappedBy = "matchsList")
    private List<Equipe> equipeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMatch")
    private List<ActionMatchJoueur> actionMatchJoueurList;

    public Matchs() {
    }

    public Matchs(String idMatch) {
        this.idMatch = idMatch;
    }

    public Matchs(String idMatch, Date dateMatch, Date temps) {
        this.idMatch = idMatch;
        this.dateMatch = dateMatch;
        this.temps = temps;
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

    public Date getTemps() {
        return temps;
    }

    public void setTemps(Date temps) {
        this.temps = temps;
    }

    public List<Joueur> getJoueurList() {
        return joueurList;
    }

    public void setJoueurList(List<Joueur> joueurList) {
        this.joueurList = joueurList;
    }

    public List<Equipe> getEquipeList() {
        return equipeList;
    }

    public void setEquipeList(List<Equipe> equipeList) {
        this.equipeList = equipeList;
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
        hash += (idMatch != null ? idMatch.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matchs)) {
            return false;
        }
        Matchs other = (Matchs) object;
        if ((this.idMatch == null && other.idMatch != null) || (this.idMatch != null && !this.idMatch.equals(other.idMatch))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "nbaclasses.Matchs[ idMatch=" + idMatch + " ]";
    }
    
}
