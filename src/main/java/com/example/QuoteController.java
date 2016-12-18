package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by markheckler on 12/17/16.
 */
@RestController
public class QuoteController {
    private QuoteRepository quoteRepository;

    public QuoteController(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    @GetMapping("/random")
    public Quote getRandomQuote() {
        return this.quoteRepository.getQuotesRandomOrder().get(0);
    }
}
