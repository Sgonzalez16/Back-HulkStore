package com.msvc.store.repository;

import com.msvc.store.dto.ProductoDTO;
import com.msvc.store.entities.CategoriasEntity;
import com.msvc.store.entities.ProductosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductosRepository extends JpaRepository<ProductosEntity, Long> {

    List<ProductosEntity> findByCategorias(CategoriasEntity categoriasEntity);
}
