
package com.example.parcial2.modelos.mapas;

import com.example.parcial2.modelos.DetalleCine;
import com.example.parcial2.modelos.dtos.DetalleCineDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IMapaDetalleCineDto {

    // Convierte de Modelo a DTO
    @Mapping(source = "cine.id", target = "cineId")
    DetalleCineDTO toDto(DetalleCine detalle);

    // Convierte de DTO a Modelo
    @Mapping(source = "cineId", target = "cine.id")
    DetalleCine toEntity(DetalleCineDTO dto);
}
