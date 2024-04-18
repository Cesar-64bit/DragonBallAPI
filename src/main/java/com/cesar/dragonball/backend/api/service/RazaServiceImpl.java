package com.cesar.dragonball.backend.api.service;

import com.cesar.dragonball.backend.api.model.Raza;
import com.cesar.dragonball.backend.api.repository.RazaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RazaServiceImpl implements RazaService {

    @Autowired
    private RazaRepository razaRepository;

    @Override
    public List<Raza> findAll() {
        return (List<Raza>) razaRepository.findAll();
    }

    @Override
    public Raza findById(Long id) {
        return razaRepository.findById(id).orElse(null);
    }

    @Override
    public Raza save(Raza raza) {
        return razaRepository.save(raza);
    }

    @Override
    public void delete(Long id) {
        razaRepository.deleteById(id);
    }
}
