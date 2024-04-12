package com.cesar.dragonball.backend.api.service;

import com.cesar.dragonball.backend.api.model.Universo;
import com.cesar.dragonball.backend.api.repository.UniversoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UniversoServiceImpl implements  UniversoService {

    @Autowired
    private UniversoRepository universoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Universo> findAll() {
        return (List<Universo>) universoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Universo findById(Long id) {
        return universoRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Universo save(Universo universo) {
        return universoRepository.save(universo);
    }

    @Override
    public void delete(Long id) {
        universoRepository.deleteById(id);
    }
}
