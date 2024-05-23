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
    private UUID idRecomendacao;
    LeitorModel leitorModel;
    BookModel bookModel;
    private String msn;
    private boolean aceitar;
    private boolean enviar;

    public boolean isEnviar() {
        return enviar;
    }

    public void setEnviar(boolean enviar) {
        this.enviar = enviar;
    }

    public UUID getIdRecomendacao() {
        return idRecomendacao;
    }

    public void setIdRecomendacao(UUID idRecomendacao) {
        this.idRecomendacao = idRecomendacao;
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
}
