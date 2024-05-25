package com.exemple.service;

import com.exemple.repository.BookRepository;
import com.exemple.repository.LeitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BookService{
    private final BookRepository bookRepository;
    private final LeitorRepository leitorRepository;

    @Autowired
    public BookService(BookRepository bookRepository, LeitorRepository leitorRepository) {
        this.bookRepository = bookRepository;
        this.leitorRepository = leitorRepository;
    }
    public String adicionarLivro(Long idBook, String loginLeitor, int pgInicial, int pgFinal) {
        Optional<BookModel> bookOptional = bookRepository.findById(idBook);
        Optional<LeitorModel> leitorOptional = leitorRepository.findByLogin(loginLeitor);

        if (bookOptional.isPresent() && leitorOptional.isPresent()) {
            BookModel book = bookOptional.get();
            LeitorModel leitor = leitorOptional.get();

            book.setLeitor(leitor);
            book.setPgInicial(pgInicial);
            book.setPgFinal(pgFinal);
            book.setCategoria(definirCategoriaLivro(pgInicial, pgFinal));

            bookRepository.save(book);
            return "Livro adicionado com sucesso.";
        } else {
            return "Livro ou leitor não encontrado.";
        }
    }

    private String definirCategoriaLivro(int pgInicial, int pgFinal) {
        if (pgInicial == 0) {
            return "PLANEJADO";
        } else if (pgInicial > 0 && pgInicial < pgFinal) {
            return "LENDO";
        } else {
            return "LIDO";
        }
    }

    public List<BookModel> listarLivrosPorCategoria(String loginLeitor, String categoria) {
        List<BookModel> livros = bookRepository.findByLeitor_LoginAndCategoria(loginLeitor, categoria);
        if (livros.isEmpty()) {
            return Collections.emptyList(); // Retorna lista vazia se não houver livros na categoria
        } else {
            return livros;
        }
    }

    }
