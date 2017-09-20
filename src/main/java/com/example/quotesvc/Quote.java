package com.example.quotesvc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Quote {
    @Id
    @GeneratedValue
    private Long id;
    private String text, source;

    public Quote() {
    }

    public Quote(String text, String source) {
        this.text = text;
        this.source = source;
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getSource() {
        return source;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
