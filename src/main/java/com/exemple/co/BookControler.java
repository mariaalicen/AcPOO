package com.exemple.co;

import com.exemple.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookControler {

    @Autowired
    BookRepository bookRepository;

}
