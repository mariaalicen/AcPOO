package com.exemple.service;

import com.exemple.model.LeitorModel;
import com.exemple.repository.LeitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LeitorService {
    /*
    @Autowired
    private LeitorRepository leitorRepository;

    public String realizarLogin(String login, String senha) {
        Optional<LeitorModel> leitorOptional = leitorRepository.findByLogin(login);
        if (leitorOptional.isPresent()) {
            LeitorModel leitorModel = leitorOptional.get();
            if (leitorModel.getSenha().equals(senha)) {
                return "Login realizado com sucesso!";
            } else {
                return "Senha incorreta, tente novamente";
            }
        } else {
            return "Login não encontrado. Crie conta";
        }
    }

    public void criarContaLeitor(String login, String senha) {
        LeitorModel novoLeitor = new LeitorModel();
        novoLeitor.setLogin(login);
        novoLeitor.setSenha(senha);
        leitorRepository.save(novoLeitor);
    }
    /*
     */
}

