
package com.apiregistro2022.impl;

import com.apiregistro2022.entity.Perfil;
import com.apiregistro2022.repository.PerfilRepository;
import com.apiregistro2022.service.PerfilService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author QUISPE
 */
@Service
public class PerfilServiceImpl implements PerfilService{
    
    @Autowired
    private PerfilRepository perfilRepository;

    @Override
    public List<Perfil> findAll() {
        return perfilRepository.findAll();
    }

    @Override
    public List<Perfil> findAllCustom() {
        return perfilRepository.findAllCustom();
    }

    @Override
    public List<Perfil> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Perfil> findById(Long id) {
        return perfilRepository.findById(id);
    }

    @Override
    public Perfil add(Perfil pe) {
        return perfilRepository.save(pe);
    }

    @Override
    public Perfil update(Perfil pe) {
        Perfil objperfil = perfilRepository.getById(pe.getCodigo());
        BeanUtils.copyProperties(pe, objperfil);
        return perfilRepository.save(objperfil);
    }

    @Override
    public Perfil delete(Perfil pe) {
        Perfil objperfil = perfilRepository.getById(pe.getCodigo());
        objperfil.setEstado(false);
        return perfilRepository.save(objperfil);
    }
    
}
