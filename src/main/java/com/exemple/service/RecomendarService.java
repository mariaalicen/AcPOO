package com.exemple.service;

import com.exemple.model.BookModel;
import com.exemple.model.LeitorModel;
import com.exemple.model.RecomendarModel;
import com.exemple.repository.BookRepository;
import com.exemple.repository.LeitorRepository;
import com.exemple.repository.RecomendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;
import java.util.List;

@Service
public class RecomendarService {
    private final RecomendarRepository recomendarRepository;
    private final BookRepository bookRepository;
    private final LeitorRepository leitorRepository;

    @Autowired
    public RecomendarService(BookRepository bookRepository, LeitorRepository leitorRepository){
        this.bookRepository = bookRepository;
        this.leitorRepository = leitorRepository;
        this.recomendarRepository = bookRepository;
    }
    public String enviarRecomendacao(UUID idBook, String login, String msn) {
        //Verifica se existe no banco de dados
    Optional<BookModel> bookModelOptional = bookRepository.findById(idBook);
    Optional<LeitorModel> leitorModelOptional = leitorRepository.findByLogin(Login);

    if(bookModelOptional.isPresent() && leitorModelOptional.isPresent()){
        RecomendarModel recomendar = new RecomendarModel(bookModelOptional.get(), leitorModelOptional.get(), msn);
        //salvar no banco de dados
        recomendarRepository.save(recomendar);
        return "Envio realizado com sucesso";
    }else{
        return "Livro ou leitor não encontrado";
    }
    }
    public String evitarDuplicatas(UUID idEnvio){
        Optional<recomendacao> recomendacaoOptional = RecomendarRepository.finalByidEnvio(idEnvio);
        if (recomendacaoOptional.isPresent()){
            if (recomendarModel.getIdEnvio().equals(idEnvio)) {
                return "Recomendacao já enviada";
                }else{
                return "Recomendacao não enocntrada";
            }
        }
    }
    //buscar recomendacao
    public List<RecomendarModel> buscarRecebidas(String login){
        return recomendarRepository.findBylogin(login);
    }
    // Método para visualizar uma recomendação
    public String visualizarRecomendacao(UUID idEnvio) {
        Optional<Recomendar> recomendacaoOptional = recomendarRepository.findByIdEnvio(idEnvio);
        if (recomendacaoOptional.isPresent()) {
            Recomendar recomendar = recomendacaoOptional.get();
            recomendar.setVisualizado(true);
            recomendarRepository.save(recomendar);
            return "Recomendação visualizada: " + recomendar.getMsn();
        } else {
            return "Recomendação não encontrada.";
        }
    }

}

