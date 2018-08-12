package com.bolos.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bolos.domain.Turno;

@Repository
public interface TurnoRepository extends JpaRepository<Turno,Long> {

}
