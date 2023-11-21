package com.nba.service;

import com.nba.model.Equipe;
import com.nba.repository.EquipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipeServiceImpl implements  EquipeService {

    private  final EquipeRepository equipeRepository;

    public EquipeServiceImpl(EquipeRepository equipeRepository) {
        this.equipeRepository = equipeRepository;
    }

    @Override
    public List<Equipe> all_equipe() {
        return equipeRepository.findAll();
    }
}
