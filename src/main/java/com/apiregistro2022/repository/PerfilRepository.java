
package com.apiregistro2022.repository;

import com.apiregistro2022.entity.Perfil;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author QUISPE
 */
public interface PerfilRepository extends JpaRepository<Perfil, Long>{
    
    @Query("select pe from Perfil pe where pe.estado='1' ")
    List<Perfil> findAllCustom();
    
}
