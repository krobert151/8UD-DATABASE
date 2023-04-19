package com.salesianostriana.dam.many.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.many.model.Alumno;

public interface AlumnoRepositorio
	extends JpaRepository<Alumno, Long>{

}