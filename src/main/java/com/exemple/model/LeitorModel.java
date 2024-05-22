package com.exemple.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB LEITOR")
public class LeitorModel implements Serializable {
private static final long serialVersionUID = 1L;

@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idLeitor;
    private String email;
    private String nome;
    private String senha;

    public UUID getIdLeitor() {
        return idLeitor;
    }

    public void setIdLeitor(UUID idLeitor) {
        this.idLeitor = idLeitor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
