package com.bolos.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bolos.domain.Jugador;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador,Long> {
 
}
