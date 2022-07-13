package com.apiregistro2022.service;

import com.apiregistro2022.entity.Categoria;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author QUISPE
 */
public interface CategoriaService {
    //Mostrar todo
    List<Categoria> findAll();
    
    //Mostrar todos los habilitados
    List<Categoria> findAllCustom();
    
    //Buscar por nombre
    List<Categoria> findbyName();
    
    //Buscar por codigo, pero si no hay objetos, el Optional retorna null
    Optional<Categoria> findById(Long id);
    
    //Agregar
    Categoria add(Categoria c);
    
    //Actualizar
    Categoria update(Categoria c);
    
    //Eliminar
    Categoria delete(Categoria c);
}
