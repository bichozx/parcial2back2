package com.example.parcial2.modelos;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cines")
public class Cine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, unique = true, length = 20)
    private String nit;

    @OneToOne(mappedBy = "cine", cascade = CascadeType.ALL, orphanRemoval = true)
    private DetalleCine detalle;

    @OneToMany(mappedBy = "cine", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Sala> salas;

    public Cine() {
    }

    public Cine(String nombre, Long id, String nit, DetalleCine detalle, List<Sala> salas) {
        this.nombre = nombre;
        this.id = id;
        this.nit = nit;
        this.detalle = detalle;
        this.salas = salas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public DetalleCine getDetalle() {
        return detalle;
    }

    public void setDetalle(DetalleCine detalle) {
        this.detalle = detalle;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }
}