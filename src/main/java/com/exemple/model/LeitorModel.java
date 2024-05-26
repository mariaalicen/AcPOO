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
    private String login;
    private String senha;

    public UUID getIdLeitor() {
        return idLeitor;
    }

    public void setIdLeitor(UUID idLeitor) {
        this.idLeitor = idLeitor;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
