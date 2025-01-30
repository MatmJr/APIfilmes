package com.senac.apifilmes.service;

import com.senac.apifilmes.repository.FilmesRepositoy;
import com.senac.apifilmes.entity.Filmes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmesService {

    private final FilmesRepositoy filmesRepositoy;

    public FilmesService(FilmesRepositoy filmesRepositoy) {
        this.filmesRepositoy = filmesRepositoy;
    }

    public List<Filmes> todosFilmes(){
        return filmesRepositoy.findAll();
    }
}
