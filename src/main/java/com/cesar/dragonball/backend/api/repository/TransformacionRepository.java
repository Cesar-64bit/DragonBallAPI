package com.cesar.dragonball.backend.api.repository;

import org.hibernate.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransformacionRepository extends JpaRepository<Transaction, Long> {
}
