package com.reposteria.costos.repository;

import com.reposteria.costos.entity.Insumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsumoRepository extends JpaRepository<Insumo, Long> {
    // Aquí no necesitamos escribir código SQL, Spring lo hace por nosotros.
}