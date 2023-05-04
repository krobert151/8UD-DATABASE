package com.salesianostriana.dam.many.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.many.model.Curso;

public interface CursoRepositorio 
	extends JpaRepository<Curso, Long>{

}