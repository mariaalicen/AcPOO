package com.exemple.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

@Entity
@Table(name = "TB Leitura")
public class LeituraModel  implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private ArrayList lido;
    private ArrayList recomendado;
    private ArrayList planejado;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ArrayList getLido() {
        return lido;
    }

    public void setLido(ArrayList lido) {
        this.lido = lido;
    }

    public ArrayList getRecomendado() {
        return recomendado;
    }

    public void setRecomendado(ArrayList recomendado) {
        this.recomendado = recomendado;
    }

    public ArrayList getPlanejado() {
        return planejado;
    }

    public void setPlanejado(ArrayList planejado) {
        this.planejado = planejado;
    }
}
