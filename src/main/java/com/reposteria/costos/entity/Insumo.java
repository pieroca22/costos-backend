package com.reposteria.costos.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "insumos")
public class Insumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(name = "precio_por_kg", nullable = false)
    private Double precioPorKg; // Este será el precio Base (por Kg, por Litro o por Unidad)

    @Column(name = "tipo_unidad")
    private String tipoUnidad; // Valores: "PESO", "VOLUMEN", "UNIDAD"

    // --- CONSTRUCTOR VACÍO ---
    public Insumo() {
    }

    // --- CONSTRUCTOR CON DATOS ---
    public Insumo(String nombre, Double precioPorKg, String tipoUnidad) {
        this.nombre = nombre;
        this.precioPorKg = precioPorKg;
        this.tipoUnidad = tipoUnidad;
    }

    // --- GETTERS Y SETTERS ---

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Double getPrecioPorKg() { return precioPorKg; }
    public void setPrecioPorKg(Double precioPorKg) { this.precioPorKg = precioPorKg; }

    public String getTipoUnidad() { return tipoUnidad; }
    public void setTipoUnidad(String tipoUnidad) { this.tipoUnidad = tipoUnidad; }
}