package com.devSuperior.dsList.controllers;

import com.devSuperior.dsList.dto.GameMinDto;
import com.devSuperior.dsList.entities.Games;
import com.devSuperior.dsList.service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GamesController {

    @Autowired
    GamesService gamesService;

    @GetMapping
    public List<GameMinDto> findALL() {
        return gamesService.findALL();
    }
}
