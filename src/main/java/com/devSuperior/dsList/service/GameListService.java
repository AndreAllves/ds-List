package com.devSuperior.dsList.service;

import com.devSuperior.dsList.GameListRepository;
import com.devSuperior.dsList.GameRepository;
import com.devSuperior.dsList.dto.GameListDto;
import com.devSuperior.dsList.entities.GameList;
import com.devSuperior.dsList.projections.GameMinProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;



    @Transactional(readOnly = true)
    public List<GameListDto> findALL() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDto(x)).toList();
    }

    public void move(long listId, int sourceIndex, int destinationIndex) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        GameMinProjection game = result.remove(sourceIndex);
        result.add(destinationIndex, game);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex > destinationIndex ? sourceIndex : destinationIndex;

        for(int i = min; i <= max; i++) {
            gameListRepository.updateBelongingPosition(listId, result.get(i).getId(), i);
        }
    }
}
