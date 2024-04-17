package com.cesar.dragonball.backend.api.service;

import com.cesar.dragonball.backend.api.model.Transformacion;
import com.cesar.dragonball.backend.api.repository.TransformacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TransformacionServiceImpl implements TransformacionService {

    @Autowired
    private TransformacionRepository transformacionRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Transformacion> findAll() {
        return (List<Transformacion>) transformacionRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Transformacion findById(Long id) {
        return transformacionRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public Transformacion save(Transformacion transformacion) {
        return transformacionRepository.save(transformacion);
    }

    @Override
    @Transactional(readOnly = true)
    public void delete(Long id) {
        transformacionRepository.deleteById(id);
    }
}
