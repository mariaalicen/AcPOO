package com.exemple.repository;

import com.exemple.model.BookModel;
import com.exemple.model.LeitorModel;
import com.exemple.model.RecomendarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import java.util.List;
import java.util.Optional;

//esta incompleto
@Repository
public interface RecomendarRepository extends JpaRepository<RecomendarModel, UUID> {
    List<RecomendarModel> findByLeitor_Login(String login);
    Optional<RecomendarModel> findByIdEnvio(UUID idEnvio);
    boolean existsByBookAndLeitor(BookModel book, LeitorModel leitor);
}
