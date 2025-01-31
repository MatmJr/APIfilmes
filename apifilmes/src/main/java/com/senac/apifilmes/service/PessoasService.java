package com.senac.apifilmes.service;

import com.senac.apifilmes.entity.Pessoas;
import com.senac.apifilmes.repository.PessoasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoasService {

    private final PessoasRepository pessoasRepository;

    public PessoasService(PessoasRepository pessoasRepository) {
        this.pessoasRepository = pessoasRepository;
    }

    public Pessoas salvarPessoas(Pessoas pessoa) {
        return pessoasRepository.save(pessoa);
    }

    public List<Pessoas> todasPessoas() {
        return pessoasRepository.findAll();
    }
}
