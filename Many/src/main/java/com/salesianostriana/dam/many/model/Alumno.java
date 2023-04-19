package com.salesianostriana.dam.many.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Alumno {
	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre, apellidos,email;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name="fk_alumno_curso"))
	private Curso curso;
	
	/*
	 * METODOS HELPER
	 * */
	
	public void addToCurso(Curso curso) {
		this.curso=curso;
		curso.getAlumnos().add(this);
		
	}
	public void removeToCurso(Curso curso) {
		curso.getAlumnos().remove(this);
		this.curso = null;
	}
	
}
