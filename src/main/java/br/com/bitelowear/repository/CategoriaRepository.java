package br.com.bitelowear.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bitelowear.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	
	

}
