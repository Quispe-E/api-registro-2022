
package com.apiregistro2022.service;

import com.apiregistro2022.entity.Empleado;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author QUISPE
 */
public interface EmpleadoService {
    
    List<Empleado> findAll();
    
    List<Empleado> findAllCustom();
    
    List<Empleado> findbyName();
    
    Optional<Empleado> findById(Long id);
    
    Empleado add(Empleado e);
    
    Empleado update(Empleado e);
    
    Empleado delete(Empleado e);
    
}
