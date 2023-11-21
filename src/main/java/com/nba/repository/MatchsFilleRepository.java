package com.nba.repository;

import com.nba.model.MatchsFille;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchsFilleRepository extends JpaRepository<MatchsFille, String> {

    List<MatchsFille> findMatchsFilleByIdMatch(String id_match);

}
