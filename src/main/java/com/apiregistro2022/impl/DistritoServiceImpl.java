
package com.apiregistro2022.impl;

import com.apiregistro2022.entity.Distrito;
import com.apiregistro2022.repository.DistritoRepository;
import com.apiregistro2022.service.DistritoService;
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
public class DistritoServiceImpl implements DistritoService{
    
    @Autowired
    public DistritoRepository distritoRepository;

    @Override
    public List<Distrito> findAll() {
        return distritoRepository.findAll();
    }

    @Override
    public List<Distrito> findAllCustom() {
        return distritoRepository.findAllCustom();
    }

    @Override
    public List<Distrito> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Distrito> findById(Long id) {
        return distritoRepository.findById(id);
    }

    @Override
    public Distrito add(Distrito d) {
        return distritoRepository.save(d);
    }

    @Override
    public Distrito update(Distrito d) {
        Distrito objdistrito = distritoRepository.getById(d.getCodigo());
        BeanUtils.copyProperties(d, objdistrito);
        return distritoRepository.save(objdistrito);
    }

    @Override
    public Distrito delete(Distrito d) {
        Distrito objdistrito = distritoRepository.getById(d.getCodigo());
        objdistrito.setEstado(false);
        return distritoRepository.save(objdistrito);
    }
    
}
