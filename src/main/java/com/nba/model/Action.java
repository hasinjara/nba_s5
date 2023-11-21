package com.nba.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Action {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id_action", nullable = false, length = -1)
    private String idAction;

    public String getIdAction() {
        return idAction;
    }

    public void setIdAction(String idAction) {
        this.idAction = idAction;
    }

    @Basic
    @Column(name = "action", nullable = true, length = 50)
    private String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Action action1 = (Action) o;
        return Objects.equals(idAction, action1.idAction) && Objects.equals(action, action1.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAction, action);
    }
}
