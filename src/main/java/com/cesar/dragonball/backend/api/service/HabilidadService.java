package com.cesar.dragonball.backend.api.service;

import com.cesar.dragonball.backend.api.model.Habilidad;

import java.util.List;

public interface HabilidadService {

    public List<Habilidad> findAll();
    public Habilidad findById(Long id);
    public Habilidad save(Habilidad habilidad);
    public void delete(Long id);
}
