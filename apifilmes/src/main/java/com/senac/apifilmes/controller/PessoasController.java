package com.senac.apifilmes.controller;

import com.senac.apifilmes.entity.Pessoas;
import com.senac.apifilmes.service.PessoasService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoas")
public class PessoasController {
    private final PessoasService pessoasService;

    public PessoasController(PessoasService pessoasService) {
        this.pessoasService = pessoasService;
    }

    @PostMapping("/adicionar")
    public ResponseEntity<Pessoas> salvarPessoas(@RequestBody Pessoas pessoas) {
        return ResponseEntity.ok(pessoasService.salvarPessoas(pessoas));
    }

}
