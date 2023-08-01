package com.devfactory.gamelist.controllers;

import com.devfactory.gamelist.dto.GameDTO;
import com.devfactory.gamelist.dto.GameFullDTO;
import com.devfactory.gamelist.dto.GameListDTO;
import com.devfactory.gamelist.entities.GameList;
import com.devfactory.gamelist.services.GameListService;
import com.devfactory.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    //Controller injetando uma instância de um Service
    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO>findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
