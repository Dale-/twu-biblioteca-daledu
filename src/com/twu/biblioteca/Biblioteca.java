package com.twu.biblioteca;

public class Biblioteca {

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
                    System.out.println(Book.listBookLibrary());
                    break;
            }
        }
    }

    public Biblioteca() {

    }

    public String welcome() {
        return "----- WELCOME TO BIBLIOTECA -----\n";
    }

    public String menu() {
        return "----------Menu----------\n" +
               "[1] List Book Library\n" +
               "[0] Quit Biblioteca System\n" +
               "Please Enter Your Choice :";
    }
}
