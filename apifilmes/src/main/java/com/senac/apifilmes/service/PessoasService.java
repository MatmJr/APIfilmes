package com.senac.apifilmes.service;

import com.senac.apifilmes.entity.Pessoas;
import com.senac.apifilmes.repository.PessoasRepository;
import org.springframework.stereotype.Service;

@Service
public class PessoasService {

    private final PessoasRepository pessoasRepository;

    public PessoasService(PessoasRepository pessoasRepository) {
        this.pessoasRepository = pessoasRepository;
    }

    public Pessoas salvarPessoas(Pessoas pessoa) {
        return pessoasRepository.save(pessoa);
    }
}
