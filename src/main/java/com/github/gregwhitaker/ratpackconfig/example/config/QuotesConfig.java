package com.github.gregwhitaker.ratpackconfig.example.config;

import java.util.List;

/**
 * Configuration object returned from the "quotes" section of config.yaml.
 */
public class QuotesConfig {
    private List<QuoteEntry> quotes;

    public List<QuoteEntry> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<QuoteEntry> quotes) {
        this.quotes = quotes;
    }

    public static class QuoteEntry {
        private String text;
        private String author;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }
}
