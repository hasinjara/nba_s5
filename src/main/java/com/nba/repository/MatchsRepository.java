package com.nba.repository;

import com.nba.model.Matchs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchsRepository extends JpaRepository<Matchs, String> {

}
