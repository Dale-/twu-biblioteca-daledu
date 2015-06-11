package com.twu.biblioteca;

public class Book {

    private String name;
    private String author;
    private String publishedyear;

    public Book(String name, String author, String publishedyear) {
        this.name = name;
        this.author = author;
        this.publishedyear = publishedyear;
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

    public String getBookInfo() {
        return " BookName: " + this.name + " Author: " + this.author + " PublishedYear: " + this.publishedyear + '\n';
    }

    public static String listBookLibrary() {
        String BookLibraryInfo = "-----------------------------------BOOK LIBRARY-----------------------------------\n";
        for(int i = 0; i < BookLibrary.Books().size(); i++) {
            BookLibraryInfo += "[" + (i + 1) + "]" + BookLibrary.Books().get(i).getBookInfo();
        }
        return BookLibraryInfo;
    }
}
