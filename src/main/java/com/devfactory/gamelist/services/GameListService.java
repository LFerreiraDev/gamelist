package com.devfactory.gamelist.services;

import com.devfactory.gamelist.dto.GameDTO;
import com.devfactory.gamelist.dto.GameFullDTO;
import com.devfactory.gamelist.dto.GameListDTO;
import com.devfactory.gamelist.entities.Game;
import com.devfactory.gamelist.entities.GameList;
import com.devfactory.gamelist.repositories.GameListRepository;
import com.devfactory.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class GameListService {
    //Service devolve DTO para o controller
    //Injetando uma instância do Repository
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
      List<GameList> result = gameListRepository.findAll();
      return result.stream().map(x-> new GameListDTO(x)).toList();
    }

}
