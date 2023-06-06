package com.msvc.store.controllers;

import com.msvc.store.dto.ProductoDTO;
import com.msvc.store.entities.ProductosEntity;
import com.msvc.store.service.IProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductoController {

        @Autowired
        private IProductosService iProductosService;
}
