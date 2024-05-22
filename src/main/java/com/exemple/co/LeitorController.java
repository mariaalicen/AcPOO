package com.exemple.co;

import com.exemple.repository.LeitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeitorController {

    @Autowired
    LeitorRepository leitorRepository;
}
