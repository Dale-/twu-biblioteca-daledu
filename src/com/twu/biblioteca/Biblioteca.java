package com.twu.biblioteca;

public class Biblioteca {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        System.out.println(biblioteca.welcome());
        System.out.println(biblioteca.menu());
    }

    public Biblioteca() {

    }

    public String welcome() {
        return "----- WELCOME TO BIBLIOTECA -----\n";
    }

    public String menu() {
        return "[1] List Book Library\n" +
               "[2] Quit Biblioteca System\n";
    }
}
