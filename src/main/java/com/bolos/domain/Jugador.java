package com.bolos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Jugador {
	
	@Id
	private Long id;
	
	/**
	 * Numero de lanzamiento del turno (no pueden registrar 3 lanzamientos en 1 turno)
	 */
	@Column
	private Integer numeroLanzamientoDelTurno;
	
	/**
	 * Numero de lanzamiento del juego
	 */
	@Column
	private Integer numeroLanzamientoDelJuego;
	
	@Column
	private Long TotalLanzamientos;
	
	/**
	 * El juego en el que se encuentra
	 */
	@ManyToOne
	private Juego juego;
	
	public Jugador() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumeroLanzamientoDelTurno() {
		return numeroLanzamientoDelTurno;
	}

	public void setNumeroLanzamientoDelTurno(Integer numeroLanzamientoDelTurno) {
		this.numeroLanzamientoDelTurno = numeroLanzamientoDelTurno;
	}

	public Integer getNumeroLanzamientoDelJuego() {
		return numeroLanzamientoDelJuego;
	}

	public void setNumeroLanzamientoDelJuego(Integer numeroLanzamientoDelJuego) {
		this.numeroLanzamientoDelJuego = numeroLanzamientoDelJuego;
	}

	public Long getTotalLanzamientos() {
		return TotalLanzamientos;
	}

	public void setTotalLanzamientos(Long totalLanzamientos) {
		TotalLanzamientos = totalLanzamientos;
	}

	public Juego getJuego() {
		return juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}
	
	

}
