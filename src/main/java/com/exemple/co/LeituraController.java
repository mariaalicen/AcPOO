package com.exemple.co;

import com.exemple.dtos.BookDtos;
import com.exemple.dtos.LeitorDtos;
import com.exemple.dtos.LeituraDtos;
import com.exemple.model.BookModel;
import com.exemple.model.LeituraModel;
import com.exemple.repository.LeitorRepository;
import com.exemple.repository.LeituraRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeituraController {

    @Autowired
    LeituraRepository leituraRepository;

    @PostMapping ("/leitura")
    public ResponseEntity<LeituraModel> saveLeitura(@RequestBody @Validated LeituraDtos leituraDtos){
        var leituraModel = new LeituraModel();
        return ResponseEntity.status(HttpStatus.CREATED).body(leituraRepository.save(leituraModel));
    }

}
