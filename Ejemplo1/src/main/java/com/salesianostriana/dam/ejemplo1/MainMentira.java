package com.salesianostriana.dam.ejemplo1;

import java.time.LocalDate;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainMentira {

	@Autowired
	private TaskRepository taskRepo;
	
	@PostConstruct
	public void ejecutar() {
		Task a1 = Task.builder()
				.title("Titulo de mentirijilla")
				.done(true)
				.limitDate(LocalDate.now())
				.build();
		taskRepo.save(a1);
		
	}
	
}
