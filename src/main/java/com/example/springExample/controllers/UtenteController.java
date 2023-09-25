package com.example.springExample.controllers;

import com.example.springExample.entities.Utente;
import com.example.springExample.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/utente")
public class UtenteController {

    @Autowired
    private UtenteRepository utenteRepository;

    // questo metodo inserisce un nuovo utente nel database
    @PostMapping("/create")
    public void createUtente(@RequestBody Utente u) {
        utenteRepository.saveAndFlush(u);
    }

    // questo metodo ritorna l'oggetto utente con id = id
    @GetMapping("/get")
    public Utente getUtenteById(@RequestParam long id) {
        Optional<Utente> optionalUtente = utenteRepository.findById(id);
        if (optionalUtente.isPresent()) return optionalUtente.get();
        else throw new NullPointerException("L'utente con quell'id non esiste!");
    }

    // questo metodo ritorna tutti i record del database
    @GetMapping("/getall")
    public List<Utente> getAllUtenti() {
        return utenteRepository.findAll();
    }

}
