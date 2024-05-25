package com.example.AcPOO.Classes;

import com.exemple.repository.LeitorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LeitorTests {

    @Autowired
    privaye LeitorService leitorservice;

    @Autowired
    private LeitorRepository leitorRepository;

    //Preparacao
    @Test
    public void testeVerificaExistencia(){
        Leitor leitor = new leitor();
        leitor.setId(1L);
        leitor.setEmail("teste@example.com");
        leitor.setSenha("123456");
        leitor.setNome("Maria");



    }

}
