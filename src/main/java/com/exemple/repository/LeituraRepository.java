package com.exemple.repository;

import com.exemple.model.LeituraModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LeituraRepository  extends JpaRepository<LeituraModel, UUID> {
}
