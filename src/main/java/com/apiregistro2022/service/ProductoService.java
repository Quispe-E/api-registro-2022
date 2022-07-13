
package com.apiregistro2022.service;

import com.apiregistro2022.entity.Producto;
import java.util.List;
import java.util.Optional;

/**
 * @author QUISPE
 */
public interface ProductoService {
    
    //Mostrar todo
    List<Producto> findAll();
    
    //Mostrar todos los habilitados
    List<Producto> findAllCustom();
    
    //Buscar por nombre
    List<Producto> findbyName();
    
    //Buscar por codigo, pero si no hay objetos, el Optional retorna null
    Optional<Producto> findById(Long id);
    
    //Agregar
    Producto add(Producto p);
    
    //Actualizar
    Producto update(Producto p);
    
    //Eliminar
    Producto delete(Producto p);
}
