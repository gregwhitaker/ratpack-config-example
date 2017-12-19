package com.github.gregwhitaker.ratpackconfig.example.api.quote;

import com.github.gregwhitaker.ratpackconfig.example.api.quote.model.GetQuoteResponse;
import com.github.gregwhitaker.ratpackconfig.example.config.QuotesConfig;
import ratpack.handling.Context;
import ratpack.handling.Handler;
import ratpack.jackson.Jackson;

import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Handler responsible for retrieving a random quote.
 */
public class GetQuoteHandler implements Handler {
    private final List<QuotesConfig.QuoteEntry> quotes;

    @Inject
    public GetQuoteHandler(QuotesConfig config) {
        this.quotes = config.getQuotes();
    }

    @Override
    public void handle(Context ctx) throws Exception {
        QuotesConfig config = ctx.get(QuotesConfig.class);

        QuotesConfig.QuoteEntry entry = config.getQuotes().get(ThreadLocalRandom.current().nextInt(config.getQuotes().size()));

        GetQuoteResponse response = new GetQuoteResponse();
        response.setText(entry.getText());
        response.setAuthor(entry.getAuthor());

        ctx.render(Jackson.json(response));
    }
}
