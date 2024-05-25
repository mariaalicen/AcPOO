package com.exemple.service;

import com.exemple.repository.LeituraRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;
//classificaar por categoria e mostrar todos os livros da categoria
public class LeituraService{

    @Autowired
    private LeituraRepository leituraRepository;

    public void finalizarLeitura(){

    }

}
