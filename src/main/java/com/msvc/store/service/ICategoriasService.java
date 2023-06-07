package com.msvc.store.service;

import com.msvc.store.dto.CategoriasDTO;
import com.msvc.store.entities.CategoriasEntity;

import java.util.List;

public interface ICategoriasService {
    List<CategoriasEntity> obtenerTodasCategorias();
    CategoriasEntity obtenerCategoriaPorId(Long id);
    void guardarCategoria(CategoriasEntity categoria);
    void eliminarCategoria(Long id);
}