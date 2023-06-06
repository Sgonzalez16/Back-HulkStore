package com.msvc.store.service.Implementation;

import com.msvc.store.entities.UsuariosEntity;
import com.msvc.store.exceptions.ResourceNotFoundException;
import com.msvc.store.repository.UsuariosRepository;
import com.msvc.store.service.IUsuariosService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class UsuariosServiceImpl implements IUsuariosService {

    @Autowired
    private UsuariosRepository usuarioRepository;

    @Override
    public UsuariosEntity saveUsuario(UsuariosEntity usuario) {
        String randomUsuarioId = UUID.randomUUID().toString();
        usuario.setId(randomUsuarioId);
        return usuarioRepository.save(usuario);
    }
    @Override
    public List<UsuariosEntity> getAllUsuariosList() {
        return usuarioRepository.findAll();
    }
    @Override
    public UsuariosEntity getUsuario(String usuarioId) {
        return usuarioRepository.findById(usuarioId).orElseThrow(() -> new ResourceNotFoundException("Usuario no fue encontrado con ese ID: " + usuarioId));
    }
}
