package com.twu.biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private BookLibrary bookLibrary;
    private MovieLibrary movieLibrary;

    public static void main(String[] args) {

        int choiceNumber = -1;
        final int quitNumber = 0;
        Biblioteca biblioteca = new Biblioteca();
        System.out.println(biblioteca.welcome());
        while(choiceNumber != quitNumber) {
            System.out.println(biblioteca.menu());
            choiceNumber = Integer.parseInt(InputReader.getInput());
            switch(choiceNumber) {
                case 1:
                    biblioteca.listBookLibrary();
                    break;
                case 2:
                    biblioteca.checkoutBook(biblioteca.getBookLibrary());
                    break;
                case 3:
                    biblioteca.returnBook(biblioteca.getBookLibrary());
                    break;
            }
        }
    }

    public Biblioteca() {

        bookLibrary = new BookLibrary();
        movieLibrary = new MovieLibrary();
    }

    public BookLibrary getBookLibrary() {

        return this.bookLibrary;
    }

    public MovieLibrary getMovieLibrary() {

        return this.movieLibrary;
    }

    public void listBookLibrary() {

        this.bookLibrary.listBooks(this.bookLibrary.getAvailableBooks());
    }

    public String welcome() {

        return "----- WELCOME TO BIBLIOTECA -----\n";
    }

    public String menu() {

        return "----------Menu----------\n" +
               "[1] List Book Library\n" +
               "[2] Checkout Book\n" +
               "[3] Return Book\n" +
               "[0] Quit Biblioteca System\n" +
               "Please Enter Your Choice :";
    }

    public void checkoutBook(BookLibrary bookLibrary) {

        bookLibrary.listBooks(bookLibrary.getAvailableBooks());
        System.out.println("Please input one number that you want to checkout :");
        int checkoutNumber = Integer.parseInt(InputReader.getInput());
        try {
            bookLibrary.getAvailableBooks().remove(checkoutNumber - 1);
            bookLibrary.setBorrowedBook(checkoutNumber);
            System.out.println("Thank you! Enjoy the book");
        } catch (Exception e) {
            System.out.println("That book is not available");
            e.getMessage();
        }
    }

    public void returnBook(BookLibrary bookLibrary) {
        bookLibrary.listBooks(bookLibrary.getBorrowedBooks());
        System.out.println("Please input one number that you want to return :");
        int returnNumber = Integer.parseInt(InputReader.getInput());
        try {
            bookLibrary.setReturnBook(returnNumber);
            bookLibrary.getBorrowedBooks().remove(returnNumber - 1);
            System.out.println("Thank you for returning the book");
        } catch (Exception e) {
            System.out.println("That is not a valid book to return");
            e.getMessage();
        }
    }
}
