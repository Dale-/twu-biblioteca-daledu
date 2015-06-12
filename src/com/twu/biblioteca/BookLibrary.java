package com.twu.biblioteca;

import java.util.*;

public class BookLibrary {

    private ArrayList books = new ArrayList();

    public BookLibrary() {
        this.initBookLibrary();
    }

    public static void main(String args[]) {
       // booklibrary.add(book1);
    }

    public ArrayList<Book> initBookLibrary() {

        Book book1 = new Book("Refactoring", "Martin Fowler", "July 8, 1999");
        Book book2 = new Book("Clean Code", "Robert C. Martin ", "August 11, 2008");
        Book book3 = new Book("Head First Design Patterns", "Eric Freeman", "November 4, 2004");
        Book book4 = new Book("JavaScript: The Good Parts", " Douglas Crockford", "May, 2008");
        Book book5 = new Book("Programming in Scala", " Martin Odersky", "January 4, 2011");
        Book book6 = new Book("Head First Java", "Kathy Sierra", "February 9, 2005");

        this.books.add(book1);
        this.books.add(book2);
        this.books.add(book3);
        this.books.add(book4);
        this.books.add(book5);
        this.books.add(book6);

        return this.books;
    }

    public ArrayList<Book> getBookLibrary() {
        return this.books;
    }
}
