package com.nba.repository;

import com.nba.model.ActionMatchJoueur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionMatchJoueurRepository extends JpaRepository<ActionMatchJoueur, String> {
}
