package com.example.parcial2.servicios;

import com.example.parcial2.modelos.Cine;
import com.example.parcial2.modelos.dtos.CineDTO;
import com.example.parcial2.modelos.mapas.IMapaCineDto;
import com.example.parcial2.repositorios.ICineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CineServicio {

    @Autowired
    private ICineRepository cineRepository;

    @Autowired
    private IMapaCineDto cineMapper;

    // Guardar con DTO
    public CineDTO guardar(CineDTO cineDTO) {
        Cine cine = cineMapper.toEntity(cineDTO);
        Cine guardado = cineRepository.save(cine);
        return cineMapper.convertirADTO(guardado);
    }
}
