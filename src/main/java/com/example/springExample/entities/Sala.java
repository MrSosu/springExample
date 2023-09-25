package com.example.springExample.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;
import org.hibernate.annotations.LazyGroup;

@Entity
@Table
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    @Check(constraints = "nPosti > 0")
    private int nPosti;
    @ManyToOne
    private Sede sede;

    public Sala(int id, String nome, int nPosti) {
        this.id = id;
        this.nome = nome;
        this.nPosti = nPosti;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnPosti() {
        return nPosti;
    }

    public void setnPosti(int nPosti) {
        this.nPosti = nPosti;
    }
}
