package com.salesianostriana.dam.serviciobase.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.serviciobase.model.Alumno;

public interface AlumnoReporitorio extends JpaRepository<Alumno,Long>{
	
}
