package com.salesianostriana.dam.serviciobase.servicios;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.serviciobase.model.Alumno;
import com.salesianostriana.dam.serviciobase.repo.AlumnoReporitorio;
import com.salesianostriana.dam.serviciobase.servicios.base.BaseServiceImpl;
@Service
public class AlumnoService 
	extends BaseServiceImpl<Alumno, Long, AlumnoReporitorio> {
	
}
