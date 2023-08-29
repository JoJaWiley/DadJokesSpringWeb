package com.example.dadjokeweb.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DadJokeService {
    private List<String> dadJokes = new ArrayList<>();

    public List<String> addAllJokes() {
        dadJokes.add("What do you call it when a group of apes starts a company? Monkey business.");
        dadJokes.add("Which bear is the most condescending? A pan-duh!");
        dadJokes.add("What kind of noise does a witch’s vehicle make? Brrrroooom, brrroooom.");
        dadJokes.add("What’s brown and sticky? A stick.");
        dadJokes.add("Two guys walked into a bar. The third guy ducked.");
        dadJokes.add("How do you get a country girl’s attention? A tractor.");
        dadJokes.add("Why are elevator jokes so classic and good? They work on many levels.");
        dadJokes.add("What do you call a pudgy psychic? A four-chin teller.");
        dadJokes.add("What did the police officer say to his belly-button? You’re under a vest.");
        dadJokes.add("My wife asked me to stop singing “Wonderwall” to her. I said maybe...");
        dadJokes.add("What kind of drink can be bitter and sweet? Reali-tea.");
        dadJokes.add("What do you call a naughty lamb dressed up like a skeleton for Halloween? Baaad to the bone.");
        dadJokes.add("Want to know why nurses like red crayons? Sometimes they have to draw blood.");
        dadJokes.add("What would the Terminator be called in his retirement? The Exterminator.");
        dadJokes.add("What did Tennessee? The same thing as Arkansas.");
        dadJokes.add("My wife asked me to go get 6 cans of Sprite from the grocery store. I realized when I got home that I had picked 7 up.");
        dadJokes.add("Why do bees have sticky hair? Because they use a honeycomb.");
        dadJokes.add("Why do some couples go to the gym? Because they want their relationship to work out.");
        dadJokes.add("What do you call an angry musician flipping someone off? A song bird.");
        dadJokes.add("What’s the most detail-oriented ocean? The Pacific.");

        return dadJokes;
    }

    public List<String> randomizeJokes() {
        List<String> dadJokes = addAllJokes();
        int random = 0;
        ArrayList<String> randomJokes = new ArrayList<>();

        for (int i = 0; i < dadJokes.size(); i++) {
            random = (int)(Math.random()*(dadJokes.size() - 1));
            randomJokes.add(dadJokes.get(random));
            dadJokes.remove(random);
        }

        return randomJokes;
    }

}
