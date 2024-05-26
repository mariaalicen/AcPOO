package com.exemple.repository;

import com.exemple.model.LeituraModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import java.util.List;

@Repository
public interface LeituraRepository  extends JpaRepository<LeituraModel, UUID> {
    List<LeituraModel> findByLeitorLogin(String loginLeitor);
}
