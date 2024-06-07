package com.example.AcPOO.Classes;

import com.exemple.model.LeitorModel;
import com.exemple.model.RecomendarModel;
import com.exemple.model.BookModel;
import com.exemple.repository.BookRepository;
import com.exemple.repository.LeitorRepository;
import com.exemple.repository.RecomendarRepository;
import com.exemple.service.BookService;
import com.exemple.service.LeitorService;
import com.exemple.service.RecomendarService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
public class RecomendarServiceTest {

    @Autowired
    private RecomendarRepository recomendacaoRepository;

    @Autowired
    private RecomendarService recomendacaoService;

    @Autowired
    private LeitorRepository leitorRepository;

    @Autowired
    private BookRepository bookRepository;

    private LeitorModel leitor;
    private BookModel bookModel;
    private RecomendarModel recomendacao;

    @BeforeEach
    void setUp() {
        leitor = new LeitorModel(UUID.randomUUID(), "user@example.com", "Password123");
        bookModel = new BookModel(UUID.randomUUID(), "Title", "Author", "Sinopse", 5);
        leitorRepository.save(leitor);
        bookRepository.save(bookModel);
        recomendacao = new Recomendacao(UUID.randomUUID(), leitor.getIdLeitor(), bookModel.getIdBook(), "Great book!");
    }

    @Test
    @DisplayName("Cria uma recomendação")
    void criarRecomendacao() {
        Recomendacao savedRecomendacao = recomendacaoService.criarRecomendacao(leitor.getIdLeitor(), bookModel.getIdBook(), "Great book!");

        // Verifica se a recomendação foi salva corretamente
        assertNotNull(savedRecomendacao);
        assertEquals(leitor.getIdLeitor(), savedRecomendacao.getIdLeitor());
        assertEquals(bookModel.getIdBook(), savedRecomendacao.getIdLivro());
        assertEquals("Great book!", savedRecomendacao.getMsn());
    }

    @Test
    @DisplayName("Evita duplicação de recomendação")
    void evitarDuplicata() {
        recomendacaoService.criarRecomendacao(leitor.getIdLeitor(), bookModel.getIdBook(), "Great book!");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            recomendacaoService.criarRecomendacao(leitor.getIdLeitor(), bookModel.getIdBook(), "Great book!");
        });

        assertEquals("Recomendação já enviada", exception.getMessage());
    }
}
