package com.msvc.store.controllers;

import com.msvc.store.service.IProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductosController {

        @Autowired
        private IProductosService iProductosService;
}
