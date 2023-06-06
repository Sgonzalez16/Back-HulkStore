package com.msvc.store.controllers;

import com.msvc.store.entities.UsuariosEntity;
import com.msvc.store.service.IUsuariosService;
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
    private IUsuariosService iUsuarioService;

    @PostMapping
    public ResponseEntity<UsuariosEntity> guardarUsuario(@RequestBody UsuariosEntity usuarioRequest){
        UsuariosEntity usuario = iUsuarioService.saveUsuario(usuarioRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }

    @GetMapping("/{usuarioId}")
    public ResponseEntity<UsuariosEntity> obtenerUsuario(@PathVariable String usuarioId){
        UsuariosEntity usuario = iUsuarioService.getUsuario(usuarioId);
        return ResponseEntity.ok(usuario);
    }

    @GetMapping
    public ResponseEntity<List<UsuariosEntity>> listarUsuarios() {
        List<UsuariosEntity> usuarios = iUsuarioService.getAllUsuariosList();
        return ResponseEntity.ok(usuarios);
    }
}
