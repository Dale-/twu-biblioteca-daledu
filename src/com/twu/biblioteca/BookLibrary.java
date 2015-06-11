package com.twu.biblioteca;


import java.util.*;

public class BookLibrary {

    private ArrayList books = new ArrayList();

    public static void main(String args[]) {

       // booklibrary.add(book1);
    }

    public ArrayList<Book> initBookLibrary() {

        BookLibrary bookLibrary = new BookLibrary();

        Book book1 = new Book("Refactoring", "Martin Fowler", "July 8, 1999");
        Book book2 = new Book("Clean Code", "Robert C. Martin ", "August 11, 2008");
        Book book3 = new Book("Head First Design Patterns", "Eric Freeman", "November 4, 2004");
        Book book4 = new Book("JavaScript: The Good Parts", " Douglas Crockford", "May, 2008");
        Book book5 = new Book("Programming in Scala", " Martin Odersky", "January 4, 2011");
        Book book6 = new Book("Head First Java", "Kathy Sierra", "February 9, 2005");

        ArrayList books = bookLibrary.getBooklibrary();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        return books;
    }

    public ArrayList getBooklibrary() {
        return this.books;
    }
}
