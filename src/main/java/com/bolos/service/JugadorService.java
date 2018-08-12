package com.bolos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolos.respository.JugadorRepository;

@Service
public class JugadorService {
	
	@Autowired
	private JugadorRepository jugadorRepository;

}
