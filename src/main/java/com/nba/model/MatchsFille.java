package com.nba.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "matchs_fille", schema = "public", catalog = "nba")
public class MatchsFille {
    @Id
    @Column(name = "id_match", nullable = false, length = -1)
    private String idMatch;
    @Basic
    @Column(name = "id_equipe", nullable = false, length = -1)
    private String idEquipe;

    public String getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(String idMatch) {
        this.idMatch = idMatch;
    }

    public String getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(String idEquipe) {
        this.idEquipe = idEquipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchsFille that = (MatchsFille) o;
        return Objects.equals(idMatch, that.idMatch) && Objects.equals(idEquipe, that.idEquipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMatch, idEquipe);
    }
}
