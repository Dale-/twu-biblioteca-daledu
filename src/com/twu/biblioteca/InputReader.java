package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputReader {


    public static String getInput() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            return bufferedReader.readLine();
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
