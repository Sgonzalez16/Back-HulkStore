package com.msvc.store.service.Implementation;

import com.msvc.store.entities.CategoriasEntity;
import com.msvc.store.entities.ProductosEntity;
import com.msvc.store.repository.ProductosRepository;
import com.msvc.store.service.IProductosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductoServiceImpl implements IProductosService {

    private final ProductosRepository productoRepository;

    @Override
    public List<ProductosEntity> obtenerTodosProductos() {
        return null;
    }

    @Override
    public ProductosEntity obtenerProductoPorId(Long id) {
        return null;
    }

    @Override
    public List<ProductosEntity> obtenerProductosPorCategoria(CategoriasEntity categoria) {
        return null;
    }

    @Override
    public void guardarProducto(ProductosEntity producto) {

    }

    @Override
    public void actualizarProducto(ProductosEntity producto) {

    }

    @Override
    public void eliminarProducto(Long id) {

    }
}