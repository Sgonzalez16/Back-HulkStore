package com.msvc.store.service.Implementation;

import com.msvc.store.dto.ProductoDTO;
import com.msvc.store.entities.CategoriasEntity;
import com.msvc.store.entities.ProductosEntity;
import com.msvc.store.exceptions.ResourceNotFoundException;
import com.msvc.store.repository.CategoriasRepository;
import com.msvc.store.repository.ProductosRepository;
import com.msvc.store.service.IProductosService;
import lombok.RequiredArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductosServiceImpl implements IProductosService {

    private final ProductosRepository productoRepository;
    private final CategoriasRepository categoriasRepository;

    @Override
    public void guardarProducto(@NotNull ProductosEntity producto) {
        if (producto.getPrecio() < 0) {
            throw new IllegalArgumentException("El precio del producto no puede ser negativo");
        }
        productoRepository.save(producto);
    }
    @Override
    public ProductosEntity obtenerProductoPorId(Long id) {
        return productoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Producto no fue encontrado con ese ID: " + id));
    }
    @Override
    public List<ProductosEntity> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }
    @Override
    public List<ProductosEntity> obtenerProductosPorCategoria(CategoriasEntity categoria) {
        boolean existeCategoria = categoriasRepository.existsById(categoria.getId());
        if (!existeCategoria) {
            return Collections.emptyList();
        }
        return productoRepository.findByCategorias(categoria);
    }
    @Override
    public void actualizarProducto(ProductosEntity producto) {
        if (producto == null) {
            throw new IllegalArgumentException("El producto no puede ser nulo");
        }
        Optional<ProductosEntity> productoExistente = productoRepository.findById(producto.getId_producto());
        if (productoExistente.isEmpty()) {
            throw new RuntimeException("Producto no existe");
        }
        productoRepository.save(producto);
    }
    @Override
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }
}