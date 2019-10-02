package com.example.demo.services;

import com.example.demo.models.Game;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import com.example.demo.repositories.GamesRepository;

@Service
public class GamesService {

    @Autowired
    GamesRepository gr;

    public List<Game> findAllGames() {
        return (List<Game>) gr.findAll();
    }
}
