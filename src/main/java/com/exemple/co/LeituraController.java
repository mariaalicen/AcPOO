package com.exemple.co;

import com.exemple.repository.LeituraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeituraController {

    @Autowired
    LeituraRepository leituraRepository;
}
