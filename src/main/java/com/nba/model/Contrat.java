/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nba.model;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;

/**
 *
 * @author hasinjara
 */
@Entity
@Table(name = "contrat")
public class Contrat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_contrat")
    private String idContrat;
    @Column(name = "numero_joueur")
    private Integer numeroJoueur;
    @Column(name = "date_contrat")
    @Temporal(TemporalType.DATE)
    private Date dateContrat;
    @Column(name = "date_fin")
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    @JoinColumn(name = "id_equipe", referencedColumnName = "id_equipe")
    @ManyToOne
    private Equipe idEquipe;
    @JoinColumn(name = "id_joueur", referencedColumnName = "id_joueur")
    @ManyToOne
    private Joueur idJoueur;

    public Contrat() {
    }

    public Contrat(String idContrat) {
        this.idContrat = idContrat;
    }

    public String getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(String idContrat) {
        this.idContrat = idContrat;
    }

    public Integer getNumeroJoueur() {
        return numeroJoueur;
    }

    public void setNumeroJoueur(Integer numeroJoueur) {
        this.numeroJoueur = numeroJoueur;
    }

    public Date getDateContrat() {
        return dateContrat;
    }

    public void setDateContrat(Date dateContrat) {
        this.dateContrat = dateContrat;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Equipe getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(Equipe idEquipe) {
        this.idEquipe = idEquipe;
    }

    public Joueur getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(Joueur idJoueur) {
        this.idJoueur = idJoueur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idContrat != null ? idContrat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contrat)) {
            return false;
        }
        Contrat other = (Contrat) object;
        if ((this.idContrat == null && other.idContrat != null) || (this.idContrat != null && !this.idContrat.equals(other.idContrat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "nbaclasses.Contrat[ idContrat=" + idContrat + " ]";
    }
    
}
