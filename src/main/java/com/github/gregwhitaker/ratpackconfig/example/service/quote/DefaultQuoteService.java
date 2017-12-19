package com.github.gregwhitaker.ratpackconfig.example.service.quote;

import com.github.gregwhitaker.ratpackconfig.example.service.quote.model.Quote;
import ratpack.exec.Promise;

public class DefaultQuoteService implements QuoteService {

    @Override
    public Promise<Quote> getQuote() {
        return null;
    }
}
