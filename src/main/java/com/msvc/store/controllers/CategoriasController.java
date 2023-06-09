package com.msvc.store.controllers;

import com.msvc.store.dto.CategoriasDTO;
import com.msvc.store.entities.CategoriasEntity;
import com.msvc.store.repository.CategoriasRepository;
import com.msvc.store.service.ICategoriasService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/categorias")
public class CategoriasController {

    private final ICategoriasService iCategoriasService;

    @PostMapping
    public ResponseEntity<CategoriasEntity> guardarCategoria(@RequestBody CategoriasEntity categoria) {
         iCategoriasService.guardarCategoria(categoria);
         return ResponseEntity.status(HttpStatus.CREATED).body(categoria);
    }

    @GetMapping
    public List<CategoriasEntity> obtenerCategorias() {
        return iCategoriasService.obtenerTodasCategorias();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriasEntity> listarCtaegoriasId(@PathVariable Long id){
        CategoriasEntity categoria = iCategoriasService.obtenerCategoriaPorId(id);
        return ResponseEntity.ok(categoria);
    }

    @DeleteMapping("/{id}")
    public void eliminarCategoria(@PathVariable Long id) {
        iCategoriasService.eliminarCategoria(id);
    }
}
