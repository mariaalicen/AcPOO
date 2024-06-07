package com.example.AcPOO.Classes;

import com.exemple.repository.LeitorRepository;
import com.exemple.service.LeitorService;
import com.exemple.model.LeitorModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@ActiveProfiles("Test Lietor")
public class LeitorTests {

    @Autowired
    private LeitorRepository leitorRepository;

    @Autowired
    private LeitorService leitorService;
    private LeitorModel leitormodel ;

    @BeforeEach
    void setUp(){
        LeitorModel leitormodel = new LeitorModel(UUID.randomUUID(), "user@example.com", "Password123");
    }
    @Test
    @DisplayName("Verifica a existência de um leitor com email e senha corretos")
    void verificarExistencia() {
        leitorRepository.save(leitormodel);
        LeitorModel foundLeitor = leitorService.verificarExistencia(leitormodel.getLogin(), leitormodel.getSenha());
        assertNotNull(foundLeitor);
        assertEquals(leitormodel.getLogin(), foundLeitor.getLogin());
    }

    @Test
    @DisplayName("Cria um leitor com email e senha válidos")
    void criarObjeto() {
        LeitorModel savedLeitor = leitorService.criarLeitor(leitormodel.getLogin(), leitormodel .getSenha());
        assertNotNull(savedLeitor);
        assertEquals(leitormodel.getLogin(), savedLeitor.getLogin());
    }
    @Test
    @DisplayName("Falha ao criar um leitor com email já existente")
    void evitaDuplicatas() {

        leitorRepository.save(leitormodel);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            leitorService.criarLeitor(leitormodel.getLogin(), leitormodel.getSenha());
        });

        assertEquals("Email já inserido", exception.getMessage());
    }
}

