package com.exemple.service;

import com.exemple.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class BookService{

    @Autowired
    private BookRepository bookRepository;

    public void visualizarLivro(UUID idBook) {
        // Implementação do método
    }

    }
