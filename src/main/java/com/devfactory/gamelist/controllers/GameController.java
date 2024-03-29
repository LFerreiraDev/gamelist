package com.devfactory.gamelist.controllers;

import com.devfactory.gamelist.dto.GameDTO;
import com.devfactory.gamelist.dto.GameFullDTO;
import com.devfactory.gamelist.entities.Game;
import com.devfactory.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    //Controller injetando uma instância de um Service
    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameFullDTO findAll(@PathVariable  Long id){
        GameFullDTO result = gameService.findById(id);
        return result;
    }

    @GetMapping
    public List<GameDTO>findAll(){
        List<GameDTO> result = gameService.findAll();
        return result;
    }
}
