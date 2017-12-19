package com.github.gregwhitaker.ratpackconfig.example.api.quote;

import com.github.gregwhitaker.ratpackconfig.example.api.quote.model.GetQuoteResponse;
import com.github.gregwhitaker.ratpackconfig.example.service.quote.QuoteService;
import ratpack.handling.Context;
import ratpack.handling.Handler;
import ratpack.jackson.Jackson;

import javax.inject.Inject;

/**
 * Handler responsible for retrieving a random quote.
 */
public class GetQuoteHandler implements Handler {

    @Inject
    private QuoteService quoteService;

    @Override
    public void handle(Context ctx) throws Exception {
        quoteService.getQuote()
                .then(quote -> {
                    GetQuoteResponse response = new GetQuoteResponse();
                    response.setText(quote.getText());
                    response.setAuthor(quote.getAuthor());

                    ctx.render(Jackson.json(response));
                });
    }
}
