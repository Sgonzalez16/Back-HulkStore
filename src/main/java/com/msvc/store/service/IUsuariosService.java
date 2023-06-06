package com.msvc.store.service;

import com.msvc.store.entities.UsuariosEntity;

import java.util.List;

public interface IUsuariosService {

    UsuariosEntity saveUsuario(UsuariosEntity usuario);

    List<UsuariosEntity> getAllUsuariosList();

    UsuariosEntity getUsuario(String usuarioId);


}
