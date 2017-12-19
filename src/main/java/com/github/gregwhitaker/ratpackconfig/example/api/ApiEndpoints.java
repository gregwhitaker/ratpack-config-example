package com.github.gregwhitaker.ratpackconfig.example.api;

import com.github.gregwhitaker.ratpackconfig.example.api.quote.GetQuoteHandler;
import ratpack.func.Action;
import ratpack.handling.Chain;

/**
 * All endpoints defined within this service.
 */
public class ApiEndpoints implements Action<Chain> {

    @Override
    public void execute(Chain chain) throws Exception {
        chain.get("/quotes", GetQuoteHandler.class);
    }
}
