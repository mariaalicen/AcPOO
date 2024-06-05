package com.example.AcPOO.Classes;

import com.exemple.repository.LeitorRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LeitorTests {

    @Autowired
    privaye LeitorService leitorservice;

    @Autowired
    private LeitorRepository leitorRepository;

    //Instanciar objeto
    @BeforeEach

    @Test
    public void testeVerificaExistencia(){
        //fazer por assertEquals? ver se id existe
    }
    //Ver o que é isso de parametrizacao
    @Test
    public void testEmailVAlidacap{
        @ParameterizedTest
                @ValueSource(strings = {"". "mail". "mail@mail". "mail@mail.com"})
                public void verificaEmailValido(String email){
            assertTrue(Email.validar(email));
        }
    }



}
