package com.exemple.service;

import com.exemple.model.BookModel;
import com.exemple.model.LeitorModel;
import com.exemple.model.LeituraModel;
import com.exemple.repository.BookRepository;
import com.exemple.repository.LeituraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class LeituraService {
/*
    @Autowired
    private LeituraRepository leituraRepository;

    @Autowired
    private BookRepository bookRepository;

    private String definirCategoriaLivro(int pgInicial, int pgFinal) {
        if (pgInicial == 0) {
            return "PLANEJADO";
        } else if (pgInicial > 0 && pgInicial < pgFinal) {
            return "LENDO";
        } else if (pgInicial == pgFinal) {
            return "LIDO";
        } else {
            return "INDEFINIDO";
        }
    }

    public List<LeituraModel> listarLivrosPorCategoria(String loginLeitor, String categoria) {
        List<LeituraModel> leituras = leituraRepository.findByLeitorLogin(loginLeitor);
        return leituras.stream()
                .filter(leitura -> definirCategoriaLivro(leitura.getPgInicial(), leitura.getPgFinal()).equals(categoria))
                .collect(Collectors.toList());
    }

    public String listarLeituras(String loginLeitor) {
        List<LeituraModel> leituras = leituraRepository.findByLeitorLogin(loginLeitor);
        if (leituras.isEmpty()) {
            return "Nenhuma leitura encontrada.";
        }

        return leituras.stream()
                .map(leitura -> "ID: " + leitura.getBookModel().getIdBook() +
                        "\nTítulo: " + leitura.getBookModel().getTitle() +
                        "\nAutor: " + leitura.getBookModel().getAuthor() +
                        "\nSinopse: " + leitura.getBookModel().getSinopse() +
                        "\nCategoria: " + definirCategoriaLivro(leitura.getPgInicial(), leitura.getPgFinal()))
                .collect(Collectors.joining("\n\n"));
    }
    /*
 */
}
