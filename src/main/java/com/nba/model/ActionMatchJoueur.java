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
@Table(name = "action_match_joueur")
public class ActionMatchJoueur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_a_m_j")
    private String idAMJ;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "point")
    private Double point;
    @Column(name = "temps")
    @Temporal(TemporalType.TIME)
    private Date temps;
    @JoinColumn(name = "id_action", referencedColumnName = "id_action")
    @ManyToOne(optional = false)
    private Action idAction;
    @JoinColumn(name = "id_joueur", referencedColumnName = "id_joueur")
    @ManyToOne(optional = false)
    private Joueur idJoueur;
    @JoinColumn(name = "id_match", referencedColumnName = "id_match")
    @ManyToOne(optional = false)
    private Matchs idMatch;

    public ActionMatchJoueur() {
    }

    public ActionMatchJoueur(String idAMJ) {
        this.idAMJ = idAMJ;
    }

    public String getIdAMJ() {
        return idAMJ;
    }

    public void setIdAMJ(String idAMJ) {
        this.idAMJ = idAMJ;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    public Date getTemps() {
        return temps;
    }

    public void setTemps(Date temps) {
        this.temps = temps;
    }

    public Action getIdAction() {
        return idAction;
    }

    public void setIdAction(Action idAction) {
        this.idAction = idAction;
    }

    public Joueur getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(Joueur idJoueur) {
        this.idJoueur = idJoueur;
    }

    public Matchs getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(Matchs idMatch) {
        this.idMatch = idMatch;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAMJ != null ? idAMJ.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActionMatchJoueur)) {
            return false;
        }
        ActionMatchJoueur other = (ActionMatchJoueur) object;
        if ((this.idAMJ == null && other.idAMJ != null) || (this.idAMJ != null && !this.idAMJ.equals(other.idAMJ))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "nbaclasses.ActionMatchJoueur[ idAMJ=" + idAMJ + " ]";
    }
    
}
