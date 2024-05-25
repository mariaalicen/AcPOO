package com.exemple.repository;

import com.exemple.model.RecomendarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

//esta incompleto
@Repository
public interface RecomendarRepository extends JpaRepository<RecomendarModel, UUID> {
}
