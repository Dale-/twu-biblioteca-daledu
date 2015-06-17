package com.twu.biblioteca;

import java.util.*;

public class BookLibrary {

    private ArrayList<Book> library;

    public BookLibrary() {
        this.library = this.initBookLibrary();
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

        return this.getBooks(false);
    }

    public ArrayList<Book> getBorrowedBooks() {

        return this.getBooks(true);
    }

    public ArrayList<Book> getBooks(Boolean isCheckout) {

        ArrayList<Book> books = new ArrayList<Book>();

        for (Book book: this.library) {
            if(book.getIsBorrowed() == isCheckout) {
                books.add(book);
            }
        }

        return books;
    }

    public Book setBorrowedBook(int number) {
        Book borrowedBook = this.getAvailableBooks().get(number - 1);
        borrowedBook.setIsBorrowed(true);
        return borrowedBook;
    }

    public Book setReturnBook(int number) {
        Book returnBook = this.getBorrowedBooks().get(number - 1);
        returnBook.setIsBorrowed(false);
        return returnBook;
    }

//    public Book setIsBorrowedOfBook(int number, Boolean isBorrowed) {
//        Book book = this.getBorrowedBooks().get(number - 1);
//        book.setIsBorrowed(isBorrowed);
//        return book;
//    }

    public String listBooks(ArrayList<Book> books) {
        String BookLibraryInfo = "-----------------------------------BOOK LIBRARY-----------------------------------\n";
        for(int i = 0; i < books.size(); i++) {
            BookLibraryInfo += "[" + (i + 1) + "]" + books.get(i).getBookInfo();
        }
        System.out.println(BookLibraryInfo);
        return BookLibraryInfo;
    }
}
