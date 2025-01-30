package com.senac.apifilmes.repository;

import com.senac.apifilmes.entity.Pessoas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoasRepository extends JpaRepository<Pessoas, Integer> {
}
