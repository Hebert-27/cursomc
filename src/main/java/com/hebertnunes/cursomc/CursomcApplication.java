package com.hebertnunes.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hebertnunes.cursomc.domains.Categoria;
import com.hebertnunes.cursomc.domains.Produto;
import com.hebertnunes.cursomc.repositories.CategoriaRepository;
import com.hebertnunes.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
		
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Escritório");
		Categoria cat2 = new Categoria(null, "Informática");
		
		Produto p1 = new Produto(null, "Computador", 2.800);
		Produto p2 = new Produto(null, "Impressora", 900.00);
		Produto p3 = new Produto(null, "Mouse", 280.00);
		
		cat1.getCategorias().add((Produto) Arrays.asList(p1, p2, p3));
		cat1.getCategorias().add((Produto) Arrays.asList(p2));
		
		p1.getCategorias().add((Categoria) Arrays.asList(cat1));
		p1.getCategorias().add((Categoria) Arrays.asList(cat1, cat2));
		p1.getCategorias().add((Categoria) Arrays.asList(cat1));
		
		
		
		categoriaRepository.save(Arrays.asList(cat1, cat2));
		produtoRepository.save(Arrays.asList(p1, p2, p3));
	}
}
