package com.twu.biblioteca;

public class Biblioteca {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        System.out.println(biblioteca.welcome());
    }

    public Biblioteca() {

    }

    public String welcome() {
        return "---------- WELCOME TO BIBLIOTECA ----------";
    }
}
