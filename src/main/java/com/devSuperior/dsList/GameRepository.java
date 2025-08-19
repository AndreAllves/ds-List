package com.devSuperior.dsList;

import com.devSuperior.dsList.entities.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Games, Long> {

}
