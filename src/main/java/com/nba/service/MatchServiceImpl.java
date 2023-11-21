package com.nba.service;

import com.nba.model.Matchs;
import com.nba.repository.MatchsRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {

    private final MatchsRepository matchsRepository;

    public MatchServiceImpl(MatchsRepository matchsRepository) {
        this.matchsRepository = matchsRepository;
    }

    @Override
    public Matchs getLast()  {
        Sort sort = Sort.by(Sort.Order.desc("id_match"));
        List<Matchs> all = matchsRepository.findAll(sort);
        if(all.isEmpty() == false) {
            return all.get(0);
        }
        return null;
    }
}
