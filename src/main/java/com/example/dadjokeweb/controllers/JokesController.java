package com.example.dadjokeweb.controllers;

import com.example.dadjokeweb.services.DadJokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {

    private final DadJokeService dadJokeService;

    public JokesController(DadJokeService dadJokeService) {
        this.dadJokeService = dadJokeService;
    }

    @GetMapping("/jokes")
    public String viewJokes(Model model) {
        var jokes = dadJokeService.randomizeJokes();
        model.addAttribute("jokes", jokes);

        return "jokes.html";
    }
}
