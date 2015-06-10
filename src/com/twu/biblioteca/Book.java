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

    public static Book[] BookLibrary () {
        return new Book[]{
                new Book("Refactoring", "Martin Fowler", "July 8, 1999"),
                new Book("Clean Code", "Robert C. Martin ", "August 11, 2008"),
                new Book("Head First Design Patterns", "Eric Freeman", "November 4, 2004"),
                new Book("JavaScript: The Good Parts", " Douglas Crockford", "May, 2008"),
                new Book("Programming in Scala", " Martin Odersky", "January 4, 2011"),
                new Book("Head First Java", "Kathy Sierra", "February 9, 2005")};
    }

    public static String listBookLibrary() {
        String BookLibraryInfo = "-----------------------------------BOOK LIBRARY-----------------------------------\n";
        for(int i = 0; i < Book.BookLibrary().length; i++) {
            BookLibraryInfo += "[" + (i + 1) + "]" + Book.BookLibrary()[i].getBookInfo();
        }
        return BookLibraryInfo;
    }
}
