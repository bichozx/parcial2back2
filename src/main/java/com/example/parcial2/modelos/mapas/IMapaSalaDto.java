package com.example.parcial2.modelos.mapas;

import com.example.parcial2.modelos.Sala;
import com.example.parcial2.modelos.dtos.SalaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IMapaSalaDto {

    // Modelo a DTO
    @Mapping(source = "cine.id", target = "cineId")
    SalaDTO toDto(Sala sala);

    // DTO a Modelo
    @Mapping(source = "cineId", target = "cine.id")
    Sala toEntity(SalaDTO dto);
}

