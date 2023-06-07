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
        return categoriasRepository.findAll();
    }

    @Override
    public CategoriasEntity obtenerCategoriaPorId(Long id) {
        return categoriasRepository.findById(id).orElse(null);
    }

    @Override
    public void guardarCategoria(CategoriasEntity categoria) {
        categoriasRepository.save(categoria);
    }
    @Override
    public void eliminarCategoria(Long id) {
        categoriasRepository.deleteById(id);
    }
}
