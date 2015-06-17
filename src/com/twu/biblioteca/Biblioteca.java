package com.twu.biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private User user;
    private BookLibrary bookLibrary;
    private MovieLibrary movieLibrary;
    public static final int quitNumber = 0;

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        if(User.login(biblioteca)) {
            biblioteca.showMainMenu(biblioteca);
        }
    }

    public Biblioteca() {
        bookLibrary = new BookLibrary();
        movieLibrary = new MovieLibrary();
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return this.user;
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

    public void listMovieLibrary() {
        this.movieLibrary.listMovies(this.movieLibrary.getAvailableMovies());
    }


    public String welcome() {

        String welcomeInfo = "----- WELCOME TO BIBLIOTECA -----\n";
        System.out.println(welcomeInfo);
        return welcomeInfo;
    }

    public String mainMenu() {
        return "-------Main Menu-------\n" +
                "[1] Enter Book Library\n" +
                "[2] Enter Movie Library\n" +
                "[3] Show My Profile\n" +
                "[0] Quit Biblioteca System\n" +
                "Please Enter Your Choice :";
    }

    public void checkoutBook(BookLibrary bookLibrary) {
        bookLibrary.checkoutBook(bookLibrary);
    }

    public void returnBook(BookLibrary bookLibrary) {
        bookLibrary.returnBook(bookLibrary);
    }

    public void checkoutMovie(MovieLibrary movieLibrary) {
        movieLibrary.checkoutMovie(movieLibrary);
    }

    public void returnMovie(MovieLibrary movieLibrary) {
        movieLibrary.returnMovie(movieLibrary);
    }

    public String bookMenu() {

        return "-------Book Menu-------\n" +
               "[1] List Book Library\n" +
               "[2] Checkout Book\n" +
               "[3] Return Book\n" +
               "[0] Go Back To Main Menu\n" +
               "Please Enter Your Choice :";
    }

    public String movieMenu() {

        return "-------Movie Menu-------\n" +
                "[1] List Movie Library\n" +
                "[2] Checkout Movie\n" +
                "[3] Return Movie\n" +
                "[0] Go Back To Main Menu\n" +
                "Please Enter Your Choice :";
    }

    public void showMainMenu(Biblioteca biblioteca) {
        int input = -1;
        while(input != quitNumber) {
            System.out.println(this.mainMenu());
            input = Integer.parseInt(InputReader.getInput());
            switch(input) {
                case 1:
                    biblioteca.showBookLibrary(biblioteca);
                    break;
                case 2:
                    biblioteca.showMovieLibrary(biblioteca);
                    break;
                case 3:
                    biblioteca.getUser().printUserInfo();
                    break;
                default:
                    System.out.println("-----EXIT BIBLIOTECA-----");
            }
        }
    }

    public void showBookLibrary(Biblioteca biblioteca) {
        int input = -1;
        while(input != quitNumber) {
            System.out.println(this.bookMenu());
            input = Integer.parseInt(InputReader.getInput());
            switch(input) {
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

    public void showMovieLibrary(Biblioteca biblioteca) {
        int input = -1;
        while(input != quitNumber) {
            System.out.println(this.movieMenu());
            input = Integer.parseInt(InputReader.getInput());
            switch(input) {
                case 1:
                    biblioteca.listMovieLibrary();
                    break;
                case 2:
                    biblioteca.checkoutMovie(biblioteca.getMovieLibrary());
                    break;
                case 3:
                    biblioteca.returnMovie(biblioteca.getMovieLibrary());
                    break;
            }
        }
    }
}
