package com.devSuperior.dsList.service;

import com.devSuperior.dsList.GameRepository;
import com.devSuperior.dsList.dto.GameDto;
import com.devSuperior.dsList.dto.GameMinDto;
import com.devSuperior.dsList.entities.Game;
import com.devSuperior.dsList.projections.GameMinProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDto findById(long id){
        Game game = gameRepository.findById(id).get();
        return new GameDto(game);
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findALL() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDto> dto = result.stream().map(game -> new GameMinDto(game)).collect(Collectors.toList());
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findByList(long id) {
        List<GameMinProjection> result = gameRepository.searchByList(id);
        return result.stream().map(game -> new GameMinDto(game)).collect(Collectors.toList());
    }
}
