package com.ramon.arcis.Peliculas.repository;

import com.ramon.arcis.Peliculas.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRespository extends JpaRepository<Pelicula, Long> {
}
