package com.github.gregwhitaker.ratpackconfig.example.api.quote.model;

/**
 * Response object returned from the GetQuoteHandler API endpoint.
 */
public class GetQuoteResponse {
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
