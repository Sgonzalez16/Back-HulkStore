package com.msvc.store.controllers;

import com.msvc.store.entities.ProductosEntity;
import com.msvc.store.service.IProductosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/productos")
public class ProductosController {

        private final IProductosService iProductosService;

        @PostMapping
        public ResponseEntity<ProductosEntity> guardarProducto(@RequestBody ProductosEntity producto) {
                iProductosService.guardarProducto(producto);
                return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        @GetMapping("/{id}")
        public ResponseEntity<ProductosEntity> obtenerProductoPorId(@PathVariable Long id) {
                ProductosEntity productosEntity = iProductosService.obtenerProductoPorId(id);
                return ResponseEntity.ok(productosEntity);
        }
        @GetMapping
        public ResponseEntity<List<ProductosEntity>> listarProductos(){
                List<ProductosEntity> productos = iProductosService.obtenerTodosLosProductos();
                return ResponseEntity.ok(productos);
        }
        @PutMapping("/{id}")
        public ResponseEntity<ProductosEntity> actualizarProducto(@PathVariable Long id, @RequestBody ProductosEntity productosEntity) {
                productosEntity.setId_producto(id);
                iProductosService.actualizarProducto(productosEntity);
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        @DeleteMapping("/{id}")
        public ResponseEntity<ProductosEntity> eliminarProducto(@PathVariable Long id) {
                iProductosService.eliminarProducto(id);
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
}
