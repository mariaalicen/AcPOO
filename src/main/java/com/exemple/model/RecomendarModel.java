package com.exemple.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.UUID;


public class RecomendarModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idEnvio;
    private UUID idRecebe;
    LeitorModel leitorModel;
    BookModel bookModel;
    private String msn;

    public UUID getIdEnvioRecomendacao() {
        return idEnvio;
    }

    public void setIdEnvioRecomendacao(UUID idEnvio) {
        this.idEnvio = idEnvio;
    }

    public UUID getIdRecebe() {
        return idRecebe;
    }

    public void setIdRecebe(UUID idRecebRecomendacao) {
        this.idRecebe = idRecebRecomendacao;
    }

    public LeitorModel getLeitorModel() {
        return leitorModel;
    }

    public void setLeitorModel(LeitorModel leitorModel) {
        this.leitorModel = leitorModel;
    }

    public BookModel getBookModel() {
        return bookModel;
    }

    public void setBookModel(BookModel bookModel) {
        this.bookModel = bookModel;
    }

    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    public boolean isAceitar() {
        return aceitar;
    }

    public void setAceitar(boolean aceitar) {
        this.aceitar = aceitar;
    }

    public boolean isEnviar() {
        return enviar;
    }

    public void setEnviar(boolean enviar) {
        this.enviar = enviar;
    }
}
