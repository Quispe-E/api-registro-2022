
package com.apiregistro2022.service;

import com.apiregistro2022.entity.Cliente;
import java.util.List;
import java.util.Optional;

/**
 * @author QUISPE
 */
public interface ClienteService {
    
    List<Cliente> findAll();
    
    List<Cliente> findAllCustom();
    
    List<Cliente> findbyName();
    
    Optional<Cliente> findById(Long id);
    
    Cliente add(Cliente c);
    
    Cliente update(Cliente c);
    
    Cliente delete(Cliente c);
    
}
