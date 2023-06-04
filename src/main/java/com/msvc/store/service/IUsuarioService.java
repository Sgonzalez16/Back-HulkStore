package com.msvc.store.service;

import com.msvc.store.entity.UsuarioEntity;

import java.util.List;

public interface IUsuarioService {

    UsuarioEntity saveUsuario(UsuarioEntity usuario);

    List<UsuarioEntity> getAllUsuariosList();

    UsuarioEntity getUsuario(String usuarioId);


}
