package com.twu.biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private BookLibrary bookLibrary;

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

            }
        }
    }

    public Biblioteca() {
        bookLibrary = new BookLibrary();
    }

    public BookLibrary getBookLibrary() {
        return this.bookLibrary;
    }

    public void listBookLibrary() {
        this.bookLibrary.listBookLibrary();
    }

    public String welcome() {
        return "----- WELCOME TO BIBLIOTECA -----\n";
    }

    public String menu() {

        return "----------Menu----------\n" +
               "[1] List Book Library\n" +
               "[2] Checkout Book\n" +
               "[0] Quit Biblioteca System\n" +
               "Please Enter Your Choice :";
    }

    public void checkoutBook(BookLibrary bookLibrary) {

        System.out.println(bookLibrary.listBookLibrary());
        System.out.println("Please input one number that you want to checkout :");
        int checkoutNumber = Integer.parseInt(InputReader.getInput());
        System.out.println(checkoutNumber);
        try {
            bookLibrary.getBookLibrary().remove(checkoutNumber - 1);
            System.out.println("Thank you! Enjoy the book");
        } catch (Exception e) {
            System.out.println("That book is not available");
            e.getMessage();
        }
    }
}
