package com.devSuperior.dsList.dto;

import com.devSuperior.dsList.entities.GameList;

public class GameListDto {
    private Long id;
    private String name;

    public GameListDto() {}

    public GameListDto(GameList game) {
        id = game.getId();
        name = game.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
