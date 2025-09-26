package com.example.parcial2.repositorios;

import com.example.parcial2.modelos.Cine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ICineRepository extends JpaRepository<Cine, Long> {

    // Buscar cine por NIT
    Optional<Cine> findByNit(String nit);

    // Buscar cines por ciudad
    @Query("SELECT c FROM Cine c JOIN c.detalle d WHERE d.ciudad = :ciudad")
    List<Cine> findCinesByCiudad(@Param("ciudad") String ciudad);
}
