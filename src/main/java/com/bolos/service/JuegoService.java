package com.bolos.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolos.domain.Juego;
import com.bolos.respository.JuegoRepository;

@Service
public class JuegoService {
	
	@Autowired
	private JuegoRepository juegoRepository;
	
	public Juego findById(Long id) {
		Optional<Juego> juego= juegoRepository.findById(id);
		
		if(!juego.isPresent())
			return new Juego();
		
		return juego.get();
	}
	
	

}
