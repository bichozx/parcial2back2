package com.example.parcial2.servicios;

import com.example.parcial2.modelos.Sala;
import com.example.parcial2.modelos.dtos.SalaDTO;
import com.example.parcial2.modelos.mapas.IMapaSalaDto;
import com.example.parcial2.repositorios.ISalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaService {

    @Autowired
    private ISalaRepository salaRepository;

    @Autowired
    private IMapaSalaDto salaMapper;

    public SalaDTO guardar(SalaDTO salaDTO) {
        Sala sala = salaMapper.toEntity(salaDTO);
        Sala guardada = salaRepository.save(sala);
        return salaMapper.toDto(guardada);
    }
}
