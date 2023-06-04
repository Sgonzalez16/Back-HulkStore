package com.msvc.store.service.Implementation;

import com.msvc.store.dto.ProductoDTO;
import com.msvc.store.entity.ProductoEntity;
import com.msvc.store.repository.ProductoRepository;
import com.msvc.store.service.IProductoService;
import lombok.RequiredArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductoServiceImpl implements IProductoService {

    private final ProductoRepository productoRepository;
    @Override
    public ProductoEntity saveProducto(ProductoDTO productoDTO){
        ProductoEntity producto = new ProductoEntity();
        producto.setNombre(productoDTO.getNombre());
        producto.setPrecio(productoDTO.getPrecio());
        ProductoEntity producto1 = new ProductoEntity(productoDTO.getNombre(), productoDTO.getPrecio());
        return productoRepository.save(producto1);
    }
}