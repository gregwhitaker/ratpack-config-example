package com.github.gregwhitaker.ratpackconfig.example.service.quote;

import com.github.gregwhitaker.ratpackconfig.example.service.quote.model.Quote;
import ratpack.exec.Promise;

public interface QuoteService {

    Promise<Quote> getQuote();
}
