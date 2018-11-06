package com.hebertnunes.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hebertnunes.cursomc.domains.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
