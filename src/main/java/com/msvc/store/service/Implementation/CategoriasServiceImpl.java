package com.msvc.store.service.Implementation;

import com.msvc.store.entities.CategoriasEntity;
import com.msvc.store.repository.CategoriasRepository;
import com.msvc.store.service.ICategoriasService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriasServiceImpl implements ICategoriasService {

    private final CategoriasRepository categoriasRepository;

    @Override
    public List<CategoriasEntity> obtenerTodasCategorias() {
        return null;
    }

    @Override
    public CategoriasEntity obtenerCategoriaPorId(Long id) {
        return null;
    }

    @Override
    public void guardarCategoria(CategoriasEntity categoria) {

    }

    @Override
    public void actualizarCategoria(CategoriasEntity categoria) {

    }

    @Override
    public void eliminarCategoria(Long id) {

    }
}
