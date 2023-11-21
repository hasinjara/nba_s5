package com.nba.model;

public class Retour {

    String erreur;
    Object data;

    public Retour(String erreur, Object data) {
        this.erreur = erreur;
        this.data = data;
    }

    public Retour() {
    }

    public String getErreur() {
        return erreur;
    }

    public void setErreur(String erreur) {
        this.erreur = erreur;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
