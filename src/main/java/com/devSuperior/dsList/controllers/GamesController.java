package com.devSuperior.dsList.controllers;

import com.devSuperior.dsList.dto.GameDto;
import com.devSuperior.dsList.dto.GamesMinDto;
import com.devSuperior.dsList.entities.Games;
import com.devSuperior.dsList.service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GamesController {

    @Autowired
    GamesService gamesService;

    @GetMapping(value = "/{id}")
    public GameDto findById(@PathVariable long id){
        GameDto game = gamesService.findById(id);
        return game;
    }

    @GetMapping
    public List<GamesMinDto> findALL() {
        return gamesService.findALL();
    }
}
