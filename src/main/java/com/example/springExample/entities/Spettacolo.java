package com.example.springExample.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

import java.time.LocalDateTime;

@Entity
@Table
public class Spettacolo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private LocalDateTime orario;
    @Column(nullable = false)
    private String genere;
    @Column(nullable = false)
    @Check(constraints = "prezzo >= 0")
    private double prezzo;
    @ManyToOne
    private Sala sala;

    public Spettacolo(int id, String nome, LocalDateTime orario, String genere, double prezzo) {
        this.id = id;
        this.nome = nome;
        this.orario = orario;
        this.genere = genere;
        this.prezzo = prezzo;
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

    public LocalDateTime getOrario() {
        return orario;
    }

    public void setOrario(LocalDateTime orario) {
        this.orario = orario;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
