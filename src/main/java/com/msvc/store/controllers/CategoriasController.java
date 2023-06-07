package com.msvc.store.controllers;

import com.msvc.store.dto.CategoriasDTO;
import com.msvc.store.entities.CategoriasEntity;
import com.msvc.store.repository.CategoriasRepository;
import com.msvc.store.service.ICategoriasService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
