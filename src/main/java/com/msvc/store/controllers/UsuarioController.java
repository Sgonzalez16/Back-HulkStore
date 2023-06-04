package com.msvc.store.controllers;

import com.msvc.store.entity.UsuarioEntity;
import com.msvc.store.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuarioService iUsuarioService;

    @PostMapping
    public ResponseEntity<UsuarioEntity> guardarUsuario(@RequestBody UsuarioEntity usuarioRequest){
        UsuarioEntity usuario = iUsuarioService.saveUsuario(usuarioRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }

    @GetMapping("/usuarioId")
    public ResponseEntity<UsuarioEntity> obtenerUsuario(@PathVariable String usuarioId){
        UsuarioEntity usuario = iUsuarioService.getUsuario(usuarioId);
        return ResponseEntity.ok(usuario);
    }

    @GetMapping
    public ResponseEntity<List<UsuarioEntity>> listarUsuarios() {
        List<UsuarioEntity> usuarios = iUsuarioService.getAllUsuariosList();
        return ResponseEntity.ok(usuarios);
    }
}
