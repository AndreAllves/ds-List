package com.devSuperior.dsList.controllers;

import com.devSuperior.dsList.dto.GameDto;
import com.devSuperior.dsList.dto.GameMinDto;
import com.devSuperior.dsList.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    GameService gamesService;

    @GetMapping(value = "/{id}")
    public GameDto findById(@PathVariable long id){
        GameDto game = gamesService.findById(id);
        return game;
    }

    @GetMapping
    public List<GameMinDto> findALL() {
        return gamesService.findALL();
    }
}
