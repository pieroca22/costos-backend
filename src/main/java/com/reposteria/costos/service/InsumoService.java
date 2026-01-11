package com.reposteria.costos.service;

import com.reposteria.costos.entity.Insumo;
import com.reposteria.costos.repository.InsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsumoService {

    @Autowired // Inyección de dependencias (trae el repositorio automáticamente)
    private InsumoRepository repositorio;

    // Listar todos los insumos para mostrarlos en tu tabla
    public List<Insumo> listarTodos() {
        return repositorio.findAll();
    }

    // Guardar (sirve para Crear Nuevo y para Actualizar si tiene ID)
    public Insumo guardar(Insumo insumo) {
        return repositorio.save(insumo);
    }

    // Obtener uno solo (útil para cuando queramos editar uno específico)
    public Insumo obtenerPorId(Long id) {
        return repositorio.findById(id).orElse(null);
    }

    // Eliminar
    public void eliminar(Long id) {
        repositorio.deleteById(id);
    }
}