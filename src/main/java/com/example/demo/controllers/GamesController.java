package com.example.demo.controllers;

import com.example.demo.models.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.services.GamesService;

import java.util.List;


@RestController
@CrossOrigin("*")
public class GamesController {

    @Autowired
    GamesService gs;

    @GetMapping("/api/games")
    public List<Game> findAllGames() {
        return gs.findAllGames();
    }
}
