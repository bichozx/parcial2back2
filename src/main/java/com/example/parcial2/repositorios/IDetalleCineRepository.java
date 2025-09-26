package com.example.parcial2.repositorios;

import com.example.parcial2.modelos.DetalleCine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface IDetalleCineRepository extends JpaRepository<DetalleCine, Long> {

    // Buscar detalle por dirección
    Optional<DetalleCine> findByDireccion(String direccion);

    // Buscar detalles por ciudad
    @Query("SELECT d FROM DetalleCine d WHERE d.ciudad = :ciudad")
    List<DetalleCine> findByCiudad(@Param("ciudad") String ciudad);
}
