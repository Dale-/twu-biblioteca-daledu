package com.twu.biblioteca;

public class Book {

    private String name;
    private String author;
    private String publishedyear;
    private Boolean isBorrowed;
    private User user;

    public Book(String name, String author, String publishedyear) {
        this.name = name;
        this.author = author;
        this.publishedyear = publishedyear;
        this.isBorrowed = false;
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

    public Boolean getIsBorrowed() {

        return this.isBorrowed;
    }

    public void setIsBorrowed(Boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBookInfo() {
        return " BookName: " + this.name + " Author: " + this.author + " PublishedYear: " + this.publishedyear + '\n';
    }

    public String getBookInfoWithBorrower() {
        return " BookName: " + this.name + " Author: " + this.author + " PublishedYear: " + this.publishedyear +
               " Loaned To: " + this.user.getName() + '\n';
    }
}
