package com.cesar.dragonball.backend.api.repository;

import com.cesar.dragonball.backend.api.model.Universo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversoRepository extends JpaRepository<Universo, Long> {
}
