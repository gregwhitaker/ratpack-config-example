package com.github.gregwhitaker.ratpackconfig.example.service;

import com.github.gregwhitaker.ratpackconfig.example.service.quote.DefaultQuoteService;
import com.github.gregwhitaker.ratpackconfig.example.service.quote.QuoteService;
import com.google.inject.AbstractModule;

public class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(QuoteService.class).to(DefaultQuoteService.class);
    }
}
