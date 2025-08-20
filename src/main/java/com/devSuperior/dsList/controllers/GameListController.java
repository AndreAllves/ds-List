package com.devSuperior.dsList.controllers;

import com.devSuperior.dsList.dto.GameListDto;
import com.devSuperior.dsList.service.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    GameListService gamesListService;

    @GetMapping
    public List<GameListDto> findALL() {
        return gamesListService.findALL();
    }

}
