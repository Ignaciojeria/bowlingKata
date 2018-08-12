package com.bolos.respository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bolos.domain.Juego;

@Repository
public interface JuegoRepository extends JpaRepository<Juego,Long> {

}
