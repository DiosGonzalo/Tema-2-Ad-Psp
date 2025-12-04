package com.salesianostriana.dam.entidades.repository;

import com.salesianostriana.dam.entidades.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRespository extends JpaRepository<Persona, Long> {
}
