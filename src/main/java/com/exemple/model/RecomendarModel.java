package com.exemple.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_RECOMENDACAO")
public class RecomendarModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idEnvio;

    // Relacionamento com LeitorModel
    @ManyToOne
    @JoinColumn(name = "leitor_id")
    private LeitorModel leitorModel;

    // Relacionamento com BookModel
    @ManyToOne
    @JoinColumn(name = "book_id")
    private BookModel bookModel;

    private String msn;


    public RecomendarModel() {
    }


    public RecomendarModel(BookModel bookModel, LeitorModel leitorModel, String msn) {
        this.bookModel = bookModel;
        this.leitorModel = leitorModel;
        this.msn = msn;
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
}



