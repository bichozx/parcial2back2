package com.example.parcial2.modelos.mapas;
import com.example.parcial2.modelos.Cine;
import com.example.parcial2.modelos.dtos.CineDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IMapaCineDto {

    IMapaCineDto INSTANCE = Mappers.getMapper(IMapaCineDto.class);

    // Convierte de Modelo a DTO
    @Mapping(source = "id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "nit", target = "nit")
    CineDTO convertirADTO(Cine cine);

    // Convierte de DTO a Modelo
    @Mapping(source = "id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "nit", target = "nit")
    Cine toEntity(CineDTO dto);
}
