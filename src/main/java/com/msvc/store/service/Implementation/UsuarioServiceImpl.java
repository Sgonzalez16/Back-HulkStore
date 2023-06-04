package com.msvc.store.service.Implementation;

import com.msvc.store.entity.UsuarioEntity;
import com.msvc.store.exceptions.ResourceNotFoundException;
import com.msvc.store.repository.UsuarioRepository;
import com.msvc.store.service.IUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class UsuarioServiceImpl implements IUsuarioService {

    private UsuarioRepository usuarioRepository;
    @Override
    public UsuarioEntity saveUsuario(UsuarioEntity usuario) {
        String randomUsuarioId = UUID.randomUUID().toString();
        usuario.setId_usuario(randomUsuarioId);
        return usuarioRepository.save(usuario);
    }
    @Override
    public List<UsuarioEntity> getAllUsuariosList() {
        return usuarioRepository.findAll();
    }
    @Override
    public UsuarioEntity getUsuario(String usuarioId) {
        return usuarioRepository.findById(usuarioId).orElseThrow(() -> new ResourceNotFoundException("Usuario no fue encontrado con ese ID: " + usuarioId));
    }
}
