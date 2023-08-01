package com.devfactory.gamelist.services;

import com.devfactory.gamelist.dto.GameDTO;
import com.devfactory.gamelist.dto.GameFullDTO;
import com.devfactory.gamelist.entities.Game;
import com.devfactory.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class GameService {
    //Service devolve DTO para o controller
    //Injetando uma instância do Repository
    @Autowired
    private GameRepository gameRepository;


    @Transactional(readOnly = true)
    public List<GameDTO> findAll() {
      List<Game> result = gameRepository.findAll();
      return result.stream().map(x-> new GameDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public GameFullDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameFullDTO(result);

    }
}
