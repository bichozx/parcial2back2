package com.example.parcial2.repositorios;

import com.example.parcial2.modelos.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ISalaRepository extends JpaRepository<Sala, Long> {

    // Buscar sala por nombre exacto
    Optional<Sala> findByNombre(String nombre);

    // Buscar salas por tipo (pueden ser varias)
    @Query("SELECT s FROM Sala s WHERE s.tipo = :tipo")
    List<Sala> findSalasByTipo(@Param("tipo") String tipo);
}
