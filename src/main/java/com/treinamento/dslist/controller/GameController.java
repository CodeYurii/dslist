package com.treinamento.dslist.controller;

import com.treinamento.dslist.dto.GameDTO;
import com.treinamento.dslist.dto.GameMinDTO;
import com.treinamento.dslist.entities.Game;
import com.treinamento.dslist.repositories.GameRepository;
import com.treinamento.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable long id){
        GameDTO result = gameService.findById(id);
        return result;
    }
}
