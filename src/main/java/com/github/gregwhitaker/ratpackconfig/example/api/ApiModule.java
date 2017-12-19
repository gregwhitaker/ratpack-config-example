package com.github.gregwhitaker.ratpackconfig.example.api;

import com.github.gregwhitaker.ratpackconfig.example.api.quote.GetQuoteHandler;
import com.google.inject.AbstractModule;

public class ApiModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ApiEndpoints.class);

        bind(GetQuoteHandler.class);
    }
}
