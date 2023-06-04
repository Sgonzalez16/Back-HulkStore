package com.msvc.store.service;

import com.msvc.store.dto.ProductoDTO;
import com.msvc.store.entity.ProductoEntity;
import com.msvc.store.entity.UsuarioEntity;

public interface IProductoService {

    ProductoEntity saveProducto(ProductoDTO producto);
}
