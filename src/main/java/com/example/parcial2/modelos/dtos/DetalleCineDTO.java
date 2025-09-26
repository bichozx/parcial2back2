package com.example.parcial2.modelos.dtos;

public class DetalleCineDTO {

    private Long id;
    private String direccion;
    private String ciudad;
    private String telefono;
    private Long cineId; // relación con Cine

    public DetalleCineDTO() {}

    public DetalleCineDTO(Long id, String direccion, String ciudad, String telefono, Long cineId) {
        this.id = id;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.cineId = cineId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Long getCineId() {
        return cineId;
    }

    public void setCineId(Long cineId) {
        this.cineId = cineId;
    }
}
