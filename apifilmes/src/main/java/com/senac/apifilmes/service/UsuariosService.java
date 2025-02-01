package com.senac.apifilmes.service;

import com.senac.apifilmes.exception.PessoaNaoEncontradaException;
import com.senac.apifilmes.repository.UsuariosRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService implements UserDetailsService {

    private final UsuariosRepository usuariosRepository;

    public UsuariosService(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws PessoaNaoEncontradaException {
        return usuariosRepository.findByUsername(username).orElseThrow(
                () -> new PessoaNaoEncontradaException("Username não cadastrado!")
        );
    }
}
