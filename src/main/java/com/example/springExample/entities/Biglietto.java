package com.example.springExample.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table
public class Biglietto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private LocalDateTime timestamp;
    @ManyToOne
    private Utente utente;
    @ManyToOne
    private Spettacolo spettacolo;
    @ManyToOne
    private Posto posto;

    public Biglietto(int id, LocalDateTime timestamp, Utente utente, Spettacolo spettacolo, Posto posto) {
        this.id = id;
        this.timestamp = timestamp;
        this.utente = utente;
        this.spettacolo = spettacolo;
        this.posto = posto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Spettacolo getSpettacolo() {
        return spettacolo;
    }

    public void setSpettacolo(Spettacolo spettacolo) {
        this.spettacolo = spettacolo;
    }

    public Posto getPosto() {
        return posto;
    }

    public void setPosto(Posto posto) {
        this.posto = posto;
    }
}
