package com.exemple.service;

import com.exemple.model.BookModel;
import com.exemple.model.LeitorModel;
import com.exemple.model.RecomendarModel;
import com.exemple.repository.BookRepository;
import com.exemple.repository.LeitorRepository;
import com.exemple.repository.RecomendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RecomendarService {
    @Autowired
    private final RecomendarRepository recomendarRepository;
    private final BookRepository bookRepository;
    private final LeitorRepository leitorRepository;
    private final RecomendarModel recomendarModel;

    public RecomendarService(RecomendarRepository recomendarRepository, BookRepository bookRepository, LeitorRepository leitorRepository, RecomendarModel recomendarModel) {
        this.recomendarRepository = recomendarRepository;
        this.bookRepository = bookRepository;
        this.leitorRepository = leitorRepository;
        this.recomendarModel = recomendarModel;
    }


    public String enviarRecomendacao(UUID idBook, String login, String msn) {
    // Verifica se livro e leitor existem
    Optional<BookModel> bookModelOptional = bookRepository.findById(idBook);
    Optional<LeitorModel> leitorModelOptional = leitorRepository.findByLogin(login);

    if (bookModelOptional.isPresent() && leitorModelOptional.isPresent()) {
        if (recomendacaoJaEnviada(bookModelOptional.get(), leitorModelOptional.get())) {
            return "Recomendação já enviada";
        }

        RecomendarModel recomendar = new RecomendarModel(bookModelOptional.get(), leitorModelOptional.get(), msn);
        recomendarRepository.save(recomendar);
        return "Envio realizado com sucesso";
    } else {
        return "Livro ou leitor não encontrado";
    }
}

private boolean recomendacaoJaEnviada(BookModel book, LeitorModel leitor) {
    return recomendarRepository.existsByBookAndLeitor(book, leitor);
}

public List<RecomendarModel> buscarRecebidas(String login) {
    return recomendarRepository.findByLeitor_Login(login);
}

public String visualizarRecomendacao(UUID idEnvio) {
    Optional<RecomendarModel> recomendacaoOptional = recomendarRepository.findByIdEnvio(idEnvio);
    if (recomendacaoOptional.isPresent()) {
        RecomendarModel recomendar = recomendacaoOptional.get();
        recomendar.setVisualizado(true);
        recomendarRepository.save(recomendar);
        return "Recomendação visualizada: " + recomendar.getMsn();
    } else {
        return "Recomendação não encontrada.";
    }
}
}
