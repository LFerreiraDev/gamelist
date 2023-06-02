package com.devfactory.gamelist.repositories;

import com.devfactory.gamelist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
    //Repository devolve o acesso a dados (entidade)
}
