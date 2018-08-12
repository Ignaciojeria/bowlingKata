package com.bolos.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bolos.domain.Juego;
import com.bolos.service.JuegoService;

@RestController
public class JuegoResource {
	
	@Autowired
	private JuegoService juegoService;
	
	@GetMapping("/juego/{id}")
	public Juego findById (@PathVariable Long id){
		return juegoService.findById(id);
	}
	

}
