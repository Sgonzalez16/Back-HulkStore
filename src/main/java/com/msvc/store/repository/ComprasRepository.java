package com.msvc.store.repository;

import com.msvc.store.entities.ComprasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprasRepository extends JpaRepository<ComprasEntity, Long> {
}
