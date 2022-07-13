
package com.apiregistro2022.repository;

import com.apiregistro2022.entity.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author QUISPE
 */
public interface ProductoRepository extends JpaRepository<Producto, Long>{
    //El nombre de la tabla debe ser identico con el nombre que le asignas en la entidad ejemplo = @Entity(name = "Producto")
    @Query("select p from Producto p where p.estado='1' ")
    List<Producto> findAllCustom();
    
}
