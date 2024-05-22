package com.exemple.co;

import com.exemple.dtos.BookDtos;
import com.exemple.dtos.LeitorDtos;
import com.exemple.model.BookModel;
import com.exemple.model.LeitorModel;
import com.exemple.repository.LeitorRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeitorController {

    @Autowired
    LeitorRepository leitorRepository;

    @PostMapping ("/leitor")
    public ResponseEntity<LeitorModel> saveLeitor(@RequestBody @Validated LeitorDtos leitorDtos){
        var leitorModel = new LeitorModel();
        return ResponseEntity.status(HttpStatus.CREATED).body(leitorRepository.save(leitorModel));
    }

}
