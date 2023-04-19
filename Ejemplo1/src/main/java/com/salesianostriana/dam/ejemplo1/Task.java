package com.salesianostriana.dam.ejemplo1;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="task")
public class Task {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="titulo")
	private String title;
	
	private boolean done;
	private LocalDate limitDate;
}
