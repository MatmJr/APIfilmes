package com.senac.apifilmes.controller;

import com.senac.apifilmes.service.FilmesService;
import com.senac.apifilmes.entity.Filmes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmesController {

    private final FilmesService filmesService;

    public FilmesController(FilmesService filmesService) {
        this.filmesService = filmesService;
    }

    @GetMapping
    public ResponseEntity<List<Filmes>> todosFilmes(){
        return new ResponseEntity<>(filmesService.todosFilmes(), HttpStatus.OK);
    }
}
