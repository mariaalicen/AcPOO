package com.exemple.co;

import com.exemple.dtos.BookDtos;
import com.exemple.model.BookModel;
import com.exemple.repository.BookRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookControler {

    @Autowired
    BookRepository bookRepository;

    @PostMapping ("/books")
    public ResponseEntity<BookModel> saveBook(@RequestBody @Validated BookDtos bookDtos){
        var bookModel = new BookModel();
        return ResponseEntity.status(HttpStatus.CREATED).body(bookRepository.save(bookModel));
    }


}
