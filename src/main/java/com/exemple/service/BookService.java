package com.exemple.service;

import com.exemple.model.BookModel;
import com.exemple.model.LeitorModel;
import com.exemple.repository.BookRepository;
import com.exemple.repository.LeitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.List;

//Criar metodos
@Service
public class BookService {
    private final BookRepository bookRepository;
    private final LeitorRepository leitorRepository;

    @Autowired
    public BookService(BookRepository bookRepository, LeitorRepository leitorRepository) {
        this.bookRepository = bookRepository;
        this.leitorRepository = leitorRepository;
    }
    public String VisualizarLivro(UUID idBook) {
        Optional<BookModel> bookOptional = bookRepository.findById(idBook);
        if (bookOptional.isPresent()) {
            BookModel book = bookOptional.get();
            return "ID: " + book.getIdBook() +
                    "\nTítulo: " + book.getTitle() +
                    "\nAutor: " + book.getAuthor() +
                    "\nSinopse: " + book.getSinopse();
        } else {
            return "Livro não encontrado.";
        }
    }

    public List<BookModel> findAll() {
            return bookRepository.findAll();
        }
    }

