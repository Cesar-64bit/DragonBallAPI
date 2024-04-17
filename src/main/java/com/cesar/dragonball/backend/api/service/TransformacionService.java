package com.cesar.dragonball.backend.api.service;

import com.cesar.dragonball.backend.api.model.Transformacion;

import java.util.List;

public interface TransformacionService {
    public List<Transformacion> findAll();
    public Transformacion findById(Long id);
    public Transformacion save(Transformacion transformacion);
    public void delete(Long id);
}
