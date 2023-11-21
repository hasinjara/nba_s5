/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nba.model;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;

/**
 *
 * @author hasinjara
 */
@Entity
@Table(name = "equipe")
@NamedQueries({
    @NamedQuery(name = "Equipe.findAll", query = "SELECT e FROM Equipe e"),
    @NamedQuery(name = "Equipe.findByIdEquipe", query = "SELECT e FROM Equipe e WHERE e.idEquipe = :idEquipe"),
    @NamedQuery(name = "Equipe.findByNom", query = "SELECT e FROM Equipe e WHERE e.nom = :nom")})
public class Equipe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_equipe")
    private String idEquipe;
    @Column(name = "nom")
    private String nom;
    @JoinTable(name = "matchs_fille", joinColumns = {
        @JoinColumn(name = "id_equipe", referencedColumnName = "id_equipe")}, inverseJoinColumns = {
        @JoinColumn(name = "id_match", referencedColumnName = "id_match")})
    @ManyToMany
    private List<Matchs> matchsList;
    @OneToMany(mappedBy = "idEquipe")
    private List<Contrat> contratList;

    public Equipe() {
    }

    public Equipe(String idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(String idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEquipe != null ? idEquipe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipe)) {
            return false;
        }
        Equipe other = (Equipe) object;
        if ((this.idEquipe == null && other.idEquipe != null) || (this.idEquipe != null && !this.idEquipe.equals(other.idEquipe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "nbaclasses.Equipe[ idEquipe=" + idEquipe + " ]";
    }
    
}
