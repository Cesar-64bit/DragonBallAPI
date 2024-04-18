package com.cesar.dragonball.backend.api.service;

import com.cesar.dragonball.backend.api.model.Habilidad;
import com.cesar.dragonball.backend.api.repository.HabilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HabilidadServiceImpl implements HabilidadService {

    @Autowired
    private HabilidadRepository habilidadRepository;
    @Override
    @Transactional(readOnly = true)
    public List<Habilidad> findAll() {
        return (List<Habilidad>) habilidadRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Habilidad findById(Long id) {
        return (Habilidad) habilidadRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public Habilidad save(Habilidad habilidad) {
        return (Habilidad) habilidadRepository.save(habilidad);
    }

    @Override
    @Transactional(readOnly = true)
    public void delete(Long id) {
        habilidadRepository.deleteById(id);
    }
}
