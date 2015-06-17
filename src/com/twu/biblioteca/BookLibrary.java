package com.twu.biblioteca;

import java.util.*;

public class BookLibrary {

    private ArrayList<Book> library;
    private ArrayList<Book> borrowedBooks;

    public BookLibrary() {
        this.library = this.initBookLibrary();
        borrowedBooks = new ArrayList<Book>();
    }

    public ArrayList<Book> initBookLibrary() {

        ArrayList<Book> books = new ArrayList<Book>();

        Book book1 = new Book("Refactoring", "Martin Fowler", "July 8, 1999");
        Book book2 = new Book("Clean Code", "Robert C. Martin ", "August 11, 2008");
        Book book3 = new Book("Head First Design Patterns", "Eric Freeman", "November 4, 2004");
        Book book4 = new Book("JavaScript: The Good Parts", " Douglas Crockford", "May, 2008");
        Book book5 = new Book("Programming in Scala", " Martin Odersky", "January 4, 2011");
        Book book6 = new Book("Head First Java", "Kathy Sierra", "February 9, 2005");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        return books;
    }

    public ArrayList<Book> getAvailableBooks() {

        ArrayList<Book> availableBooks = new ArrayList<Book>();

        for (Book book: this.library) {
            if(book.getIsCheckout()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return this.borrowedBooks;
    }

    public ArrayList<Book> setBorrowedBook(int number) {
        this.getBookLibrary().get(number - 1).setIsCheckout(true);
        return this.borrowedBooks;
    }

    public ArrayList<Book> setLibraryBook(int number) {
        Book libraryBook = this.getBorrowedBooks().get(number - 1);
        this.library.add(libraryBook);
        return this.library;
    }

    public String listBooks(ArrayList<Book> books) {
        String BookLibraryInfo = "-----------------------------------BOOK LIBRARY-----------------------------------\n";
        for(int i = 0; i < books.size(); i++) {
            BookLibraryInfo += "[" + (i + 1) + "]" + books.get(i).getBookInfo();
        }
        System.out.println(BookLibraryInfo);
        return BookLibraryInfo;
    }
}
