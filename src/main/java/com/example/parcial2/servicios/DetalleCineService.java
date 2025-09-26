package com.example.parcial2.servicios;

import com.example.parcial2.modelos.DetalleCine;
import com.example.parcial2.modelos.dtos.DetalleCineDTO;
import com.example.parcial2.modelos.mapas.IMapaDetalleCineDto;
import com.example.parcial2.repositorios.IDetalleCineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleCineService {

    @Autowired
    private IDetalleCineRepository detalleCineRepository;

    @Autowired
    private IMapaDetalleCineDto detalleMapper;

    public DetalleCineDTO guardar(DetalleCineDTO detalleDTO) {
        DetalleCine detalle = detalleMapper.toEntity(detalleDTO);
        DetalleCine guardado = detalleCineRepository.save(detalle);
        return detalleMapper.toDto(guardado);
    }
}

