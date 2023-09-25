package com.example.springExample.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

@Entity
@Table
public class Posto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    @Check(constraints = "fila > 0")
    private int fila;
    @Column(nullable = false)
    @Check(constraints = "numero > 0")
    private int numero;
    @ManyToOne
    private Sala sala;

    public Posto(int id, int fila, int numero) {
        this.id = id;
        this.fila = fila;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
