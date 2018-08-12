package com.bolos.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Juego {
	
	@Id
	private Long id;
	
	@ManyToOne
	private Jugador jugadorA;
	
	@ManyToOne
	private Jugador jugadorB;
	
	@ManyToOne
	private Jugador jugando;
	
	@OneToMany
	private List<Turno> turnos;
	
	

	public Juego() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Jugador getJugadorA() {
		return jugadorA;
	}

	public void setJugadorA(Jugador jugadorA) {
		this.jugadorA = jugadorA;
	}

	public Jugador getJugadorB() {
		return jugadorB;
	}

	public void setJugadorB(Jugador jugadorB) {
		this.jugadorB = jugadorB;
	}

	public Jugador getJugando() {
		return jugando;
	}

	public void setJugando(Jugador jugando) {
		this.jugando = jugando;
	}


	

}
