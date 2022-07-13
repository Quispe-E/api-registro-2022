package com.apiregistro2022.repository;

import com.apiregistro2022.entity.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author QUISPE
 */
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    //creamos uns funcion para mostrar todas las categorias habilitadaas
    
    @Query("select c from Categoria c where c.estado = '1'")
    List<Categoria> findAllCustom();
    
    @Query("select c from Categoria c where upper(c.nombre) like upper(:nombre) and c.estado='1'")
    List<Categoria> findByName(@Param("nombre") String nombre);
}
