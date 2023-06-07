package com.msvc.store.service;

import com.msvc.store.entities.CategoriasEntity;
import com.msvc.store.entities.ProductosEntity;

import java.util.List;

public interface IProductosService {

    List<ProductosEntity> obtenerTodosLosProductos();

    ProductosEntity obtenerProductoPorId(Long id);

    List<ProductosEntity> obtenerProductosPorCategoria(CategoriasEntity categoria);

    void guardarProducto(ProductosEntity producto);

    void actualizarProducto(ProductosEntity producto);

    void eliminarProducto(Long id);
}


