package com.ecomerce.proyecto_final.service;

import org.springframework.stereotype.Service;

import com.ecomerce.proyecto_final.model.*;
import com.ecomerce.proyecto_final.repository.*;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductoService {
    List<Producto> listaDeProductos();
    Optional<Producto> obtenerProductoPorId(Long id);
    Producto guardarProducto(Producto productoNuevo);
    Producto actualizarProducto(Long idABuscar, Producto producto);
    void eliminarProducto (Long id);
}
