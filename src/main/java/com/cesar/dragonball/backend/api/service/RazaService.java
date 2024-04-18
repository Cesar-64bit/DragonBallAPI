package com.cesar.dragonball.backend.api.service;

import com.cesar.dragonball.backend.api.model.Raza;

import java.util.List;

public interface RazaService{

    public List<Raza> findAll();
    public Raza findById(Long id);
    public Raza save(Raza raza);
    public void delete(Long id);
}
