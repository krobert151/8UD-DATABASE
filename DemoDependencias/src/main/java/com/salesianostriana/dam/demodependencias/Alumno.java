package com.salesianostriana.dam.demodependencias;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Alumno {
	@Id
	private Long id;
	
	private String nombre;
	private String apellidos;
	private String email;
	private LocalDate fechaNacimiento;
		
	
}
