package com.nba.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
public class Contrat {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id_contrat", nullable = false, length = -1)
    private String idContrat;

    public String getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(String idContrat) {
        this.idContrat = idContrat;
    }

    @Basic
    @Column(name = "id_joueur", nullable = true, length = -1)
    private String idJoueur;

    public String getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(String idJoueur) {
        this.idJoueur = idJoueur;
    }

    @Basic
    @Column(name = "id_equipe", nullable = true, length = -1)
    private String idEquipe;

    public String getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(String idEquipe) {
        this.idEquipe = idEquipe;
    }

    @Basic
    @Column(name = "numero_joueur", nullable = true)
    private Integer numeroJoueur;

    public Integer getNumeroJoueur() {
        return numeroJoueur;
    }

    public void setNumeroJoueur(Integer numeroJoueur) {
        this.numeroJoueur = numeroJoueur;
    }

    @Basic
    @Column(name = "date_contrat", nullable = true)
    private Date dateContrat;

    public Date getDateContrat() {
        return dateContrat;
    }

    public void setDateContrat(Date dateContrat) {
        this.dateContrat = dateContrat;
    }

    @Basic
    @Column(name = "date_fin", nullable = true)
    private Date dateFin;

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contrat contrat = (Contrat) o;
        return Objects.equals(idContrat, contrat.idContrat) && Objects.equals(idJoueur, contrat.idJoueur) && Objects.equals(idEquipe, contrat.idEquipe) && Objects.equals(numeroJoueur, contrat.numeroJoueur) && Objects.equals(dateContrat, contrat.dateContrat) && Objects.equals(dateFin, contrat.dateFin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idContrat, idJoueur, idEquipe, numeroJoueur, dateContrat, dateFin);
    }
}
