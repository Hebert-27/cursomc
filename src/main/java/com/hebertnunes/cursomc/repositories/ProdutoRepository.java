package com.hebertnunes.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hebertnunes.cursomc.domains.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
