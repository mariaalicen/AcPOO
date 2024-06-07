package com.exemple.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_BOOK")
public class BookModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idBook;

    private String title;
    private String author;
    private String sinopse;
    private String categoria;

    @ManyToOne
    private LeitorModel leitor;

    // Construtor parametrizado
    public BookModel(UUID idBook, String title, String author, String sinopse, String categoria, LeitorModel leitor) {
        this.idBook = idBook;
        this.title = title;
        this.author = author;
        this.sinopse = sinopse;
        this.categoria = categoria;
        this.leitor = leitor;
    }
    //Construtor para JPA
    public BookModel() {

    }

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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LeitorModel getLeitor() {
        return leitor;
    }

    public void setLeitor(LeitorModel leitor) {
        this.leitor = leitor;
    }
}
