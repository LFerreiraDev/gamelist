package com.devfactory.gamelist.repositories;

import com.devfactory.gamelist.entities.Game;
import com.devfactory.gamelist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    //Repository devolve o acesso a dados (entidade)
}
