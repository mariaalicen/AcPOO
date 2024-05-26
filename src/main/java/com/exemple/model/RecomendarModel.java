package com.exemple.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.UUID;

@Entity
public class RecomendarModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idEnvio;
    LeitorModel leitorModel;
    BookModel bookModel;
    private String msn;
    private boolean visualizado;

    public RecomendarModel(BookModel bookModel, LeitorModel leitorModel, String msn) {
    }

    public UUID getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(UUID idEnvio) {
        this.idEnvio = idEnvio;
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

    public boolean isVisualizado() {
        return visualizado;
    }

    public void setVisualizado(boolean visualizado) {
        this.visualizado = visualizado;
    }
}


