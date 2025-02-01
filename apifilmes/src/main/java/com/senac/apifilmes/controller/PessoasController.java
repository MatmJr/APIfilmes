package com.senac.apifilmes.controller;

import com.senac.apifilmes.entity.Pessoas;
import com.senac.apifilmes.service.PessoasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<Pessoas>> listarPessoas() {
        return ResponseEntity.ok(pessoasService.todasPessoas());

    //1. Atualizar um registro

    //2. Deletar um registro

    //3. Encontrar uma pessoa pelo nome
    }
    @GetMapping("{id}")
    public ResponseEntity<Pessoas> buscarPessoa(@PathVariable Integer id) {
        return ResponseEntity.ok(pessoasService.buscarPessoasPorId(id));
    }
}
