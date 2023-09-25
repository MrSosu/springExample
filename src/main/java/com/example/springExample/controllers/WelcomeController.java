package com.example.springExample.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to my homepage!";
    }

    @GetMapping("/name")
    public String welcomeNameSurname(@RequestParam String name, @RequestParam String surname) {
        return "Welcome " + name + " " + surname;
    }

    @GetMapping("/fact/{n}")
    public int fattoriale(@PathVariable int n) {
        if (n <= 1) return 1;
        else return n*fattoriale(n-1);
    }

}
