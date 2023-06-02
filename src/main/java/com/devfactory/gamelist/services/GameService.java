package com.devfactory.gamelist.services;

import com.devfactory.gamelist.dto.GameDTO;
import com.devfactory.gamelist.entities.Game;
import com.devfactory.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class GameService {
    //Service devolve DTO para o controller
    //Injetando uma instância do Repository
    @Autowired
    private GameRepository gameRepository;
    public List<GameDTO> findAll() {
      List<Game> result = gameRepository.findAll();
      return result.stream().map(x-> new GameDTO(x)).toList();
    }
}
