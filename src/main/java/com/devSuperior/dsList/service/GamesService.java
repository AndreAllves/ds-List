package com.devSuperior.dsList.service;

import com.devSuperior.dsList.GameRepository;
import com.devSuperior.dsList.dto.GamesMinDto;
import com.devSuperior.dsList.entities.Games;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GamesService {

    @Autowired
    private GameRepository gameRepository;

    public List<GamesMinDto> findALL() {
        List<Games> result = gameRepository.findAll();
        List<GamesMinDto> dto = result.stream().map(game -> new GamesMinDto(game)).collect(Collectors.toList());
        return dto;
    }
}
