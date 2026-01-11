package com.reposteria.costos.entity;

import jakarta.persistence.*;

@Entity // Esto le dice a Spring que esta clase es una tabla de MySQL
@Table(name = "insumos")
public class Insumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrementable
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(name = "precio_por_kg", nullable = false)
    private Double precioPorKg;

    // --- CONSTRUCTOR VACÍO (Requerido por JPA) ---
    public Insumo() {
    }

    // --- CONSTRUCTOR CON DATOS ---
    public Insumo(String nombre, Double precioPorKg) {
        this.nombre = nombre;
        this.precioPorKg = precioPorKg;
    }

    // --- GETTERS Y SETTERS (Para aplicar POO y Encapsulamiento) ---

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

    public Double getPrecioPorKg() {
        return precioPorKg;
    }

    public void setPrecioPorKg(Double precioPorKg) {
        this.precioPorKg = precioPorKg;
    }
}