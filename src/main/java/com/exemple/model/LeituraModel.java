package com.exemple.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_LEITURA")
public class LeituraModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    // Relacionamento com BookModel
    @ManyToOne
    @JoinColumn(name = "book_id")
    private BookModel bookModel;

    // Relacionamento com LeitorModel
    @ManyToOne
    @JoinColumn(name = "leitor_id")
    private LeitorModel leitorModel;

    private int pgInicial;
    private int pgFinal;


    public LeituraModel() {
    }

    public LeituraModel(UUID id, BookModel bookModel, LeitorModel leitorModel, int pgInicial, int pgFinal) {
        this.id = id;
        this.bookModel = bookModel;
        this.leitorModel = leitorModel;
        this.pgInicial = pgInicial;
        this.pgFinal = pgFinal;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BookModel getBookModel() {
        return bookModel;
    }

    public void setBookModel(BookModel bookModel) {
        this.bookModel = bookModel;
    }

    public LeitorModel getLeitorModel() {
        return leitorModel;
    }

    public void setLeitorModel(LeitorModel leitorModel) {
        this.leitorModel = leitorModel;
    }

    public int getPgInicial() {
        return pgInicial;
    }

    public void setPgInicial(int pgInicial) {
        this.pgInicial = pgInicial;
    }

    public int getPgFinal() {
        return pgFinal;
    }

    public void setPgFinal(int pgFinal) {
        this.pgFinal = pgFinal;
    }
}

