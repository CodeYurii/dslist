package com.treinamento.dslist.services;

import com.treinamento.dslist.dto.GameDTO;
import com.treinamento.dslist.dto.GameListDTO;
import com.treinamento.dslist.dto.GameMinDTO;
import com.treinamento.dslist.entities.Game;
import com.treinamento.dslist.entities.GameList;
import com.treinamento.dslist.repositories.GameListRepository;
import com.treinamento.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
