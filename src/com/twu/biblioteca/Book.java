package com.twu.biblioteca;

import java.util.ArrayList;

public class Book {

    private String name;
    private String author;
    private String publishedyear;
    private Boolean isCheckout;

    public Book(String name, String author, String publishedyear) {
        this.name = name;
        this.author = author;
        this.publishedyear = publishedyear;
        this.isCheckout = false;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {

        return this.author;
    }

    public String getPublishedyear() {

        return this.publishedyear;
    }

    public Boolean getIsCheckout() {

        return this.isCheckout;
    }

    public String getBookInfo() {
        return " BookName: " + this.name + " Author: " + this.author + " PublishedYear: " + this.publishedyear + '\n';
    }
}
