package com.example.AcPOO.Classes;

import com.exemple.model.BookModel;
import com.exemple.repository.BookRepository;
import com.exemple.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
//Configurando mockito
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
//Configurando padrõesJava das classeBook
import java.util.List;
import java.util.Optional;
import java.util.Arrays;
import java.util.UUID;
//Configurando importações staticas
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class
@InjectMocks
private BookService bookService;
@Mock
private BookRepository bookRepository;

@BeforeEach
public void setUp(){
    MockitoAnnotations.openMocks(this);
}
@Test
public void testLivroExiste(){
    UUID idbook = UUID.randomUUI();
    BookModel =
}


}
