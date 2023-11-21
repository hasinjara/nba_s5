package com.nba.service;

import com.nba.model.Action;
import com.nba.repository.ActionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ActionServiceImpl implements ActionService {

    private final ActionRepository actionRepository;

    @Override
    public List<Action> allAction() {
        return actionRepository.findAll();
    }
}
