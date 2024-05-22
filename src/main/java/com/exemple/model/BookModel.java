package com.exemple.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table( name = "TB BOOK")

public class BookModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idBook;
    private String title;
    private String author;
    private String sinopse;
    private int avaliacao;
    private int pgAtual;
    private int pgFinal;

    public UUID getIdBook() {
        return idBook;
    }

    public void setIdBook(UUID idBook) {
        this.idBook = idBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getPgAtual() {
        return pgAtual;
    }

    public void setPgAtual(int pgAtual) {
        this.pgAtual = pgAtual;
    }

    public int getPgFinal() {
        return pgFinal;
    }

    public void setPgFinal(int pgFinal) {
        this.pgFinal = pgFinal;
    }
}
