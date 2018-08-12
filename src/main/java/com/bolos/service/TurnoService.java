package com.bolos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolos.respository.TurnoRepository;

@Service
public class TurnoService {
	
	@Autowired
	private TurnoRepository turnoRepository;
	
	
}
