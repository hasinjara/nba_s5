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
@Table(name = "action")
public class Action implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_action")
    private String idAction;
    @Column(name = "action")
    private String action;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAction")
    private List<ActionMatchJoueur> actionMatchJoueurList;

    public Action() {
    }

    public Action(String idAction) {
        this.idAction = idAction;
    }

    public String getIdAction() {
        return idAction;
    }

    public void setIdAction(String idAction) {
        this.idAction = idAction;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
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
        hash += (idAction != null ? idAction.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Action)) {
            return false;
        }
        Action other = (Action) object;
        if ((this.idAction == null && other.idAction != null) || (this.idAction != null && !this.idAction.equals(other.idAction))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "nbaclasses.Action[ idAction=" + idAction + " ]";
    }
    
}
