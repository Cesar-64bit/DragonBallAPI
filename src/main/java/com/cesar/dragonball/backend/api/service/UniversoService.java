package com.cesar.dragonball.backend.api.service;

import com.cesar.dragonball.backend.api.model.Universo;

import java.util.List;

public interface UniversoService {

    public List<Universo> findAll();
    public Universo findById(Long id);
    public Universo save(Universo universo);
    public void delete(Long id);
}
