package com.example.AcPOO.Classes;

import com.exemple.model.BookModel;
import com.exemple.repository.BookRepository;
import com.exemple.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.UUID;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@ActiveProfiles("test Book")

class BookServiceTest{
    /*
  @Autowired
  private BookRepository bookRepository;
  private BookModel bookModel;
  private BookService bookService;

    @BeforeEach
    public void setUp() {
        BookModel livro1 = new BookModel(UUID.randomUUID(), "O poder do habito", "charles Duhigg", "Por que fazemos o que fazemos",0);
        BookModel livro2 = new BookModel(UUID.randomUUID() "mentes Extraordinarias", "Alberto Dellisola", "Como desenvolver todo potencial do cérebro",0);
        bookRepository.save(livro1);
        bookRepository.save(livro2);
    }
    //Realizando comparações infromações do livro recuperado(foundBook) com os atributos do livro originalmente salvo

    @Test //Indica que é um teste e deve ser executado pelo Junit
    @DisplayName("Verifica se o livro existe")
    public void testVerificaExistencia() {
        BookModel foundBook = bookRepository.findById(bookModel.getIdBook()).orElse(null);
        assertNotNull(foundBook);
        assertEquals(bookModel.getIdBook(), foundBook.getIdBook());

    }
    @Test
    @DisplayName("Livro não encontrado, deve retornar null")
    void testLivroNaoEnocntrado(){
        UUID nonExistentId = UUID.randomUUID();
        BookModel foundBook = bookRepository.findById(nonExistentId).orElse(null);
        assertNull(foundBook);
    }

    @Test
    @DisplayName("Verifica os atributos do livro")
    public void testMostrarLivro() {
        BookModel foundBook = bookService.findById(bookModel.getIdBook());
        assertNotNull(foundBook);
        assertEquals(bookModel.getIdBook(), foundBook.getIdBook());
        assertEquals(bookModel.getTitle(), foundBook.getTitle());
        assertEquals(bookModel.getAuthor(), foundBook.getAuthor());
        assertEquals(bookModel.getSinopse(), foundBook.getSinopse());
        assertEquals(bookModel.getAvaliacao(), foundBook.getAvaliacao());

    }

    @Test
    @DisplayName("Verifica todos os livros")
    public void listarTodosLivros() {
        List<BookModel> books = bookService.findAll();
        assertNotNull(books);
        assertEquals(2, books.size());
        assertTrue(books.contains(livro1));
        assertTrue(books.contains(livro2));
    }

     */

}
