package com.exemple.repository;

import com.exemple.model.LeitorModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LeitorRepository extends JpaRepository<LeitorModel, UUID> {
}
