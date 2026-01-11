package com.reposteria.costos.controller;

import com.reposteria.costos.entity.Insumo;
import com.reposteria.costos.service.InsumoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/insumos") // La URL base será http://localhost:8080/api/insumos
@CrossOrigin(origins = "http://localhost:5173") // Permite peticiones desde React
public class InsumoController {

    @Autowired
    private InsumoService service;

    // GET: Traer todos los insumos
    @GetMapping
    public List<Insumo> listar() {
        return service.listarTodos();
    }

    // POST: Crear un nuevo insumo
    @PostMapping
    public Insumo crear(@RequestBody Insumo insumo) {
        return service.guardar(insumo);
    }

    // PUT: Actualizar un insumo existente
    @PutMapping("/{id}")
    public Insumo actualizar(@PathVariable Long id, @RequestBody Insumo insumo) {
        Insumo insumoExistente = service.obtenerPorId(id);
        if (insumoExistente != null) {
            insumoExistente.setNombre(insumo.getNombre());
            insumoExistente.setPrecioPorKg(insumo.getPrecioPorKg());
            return service.guardar(insumoExistente);
        }
        return null; // O podría retornar un error 404
    }

    // DELETE: Borrar un insumo
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}