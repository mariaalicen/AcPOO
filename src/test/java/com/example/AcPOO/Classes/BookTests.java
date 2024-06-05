package com.example.AcPOO.Classes;

import com.exemple.model.BookModel;
import com.exemple.repository.BookRepository;
import com.exemple.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class
@InjectMocks
private BookService bookService;
@Mock
private BookRepository bookRepository;

BookModel<Integer> livros;

//Não entendi a relação dps testes com as classes, tendo os testes eunão preciso implementar alguns metodos? so excessões?

//Realiza metodo antes dos testes
@BeforeEach
//Instanciar objeto
public void instancia(){
    livros = new BookModel();
}
@Test
@DisplayName("Verifica se o livro existe")
public void verificaExistencia(){

}
@Test
public void tratarExcessaoExistencia(){

}
@Test
public void testVisualizaLivro(){

}
@Test
public void testnaoVazioLista(){

}
@Test
public void tesRemovElem(){

}
