package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibliotecaTest {

    private Biblioteca biblioteca;

    @Before
    public void setUp() throws Exception {
        biblioteca = new Biblioteca();
    }

    @Test
    public void testWelcome() throws Exception {
        assertEquals("----- WELCOME TO BIBLIOTECA -----\n", biblioteca.welcome());
    }

    @Test
    public void testMenu() throws Exception {
        assertEquals("----------Menu----------\n" +
                     "[1] List Book Library\n" +
                     "[0] Quit Biblioteca System\n" +
                     "Please Enter Your Choice :" , biblioteca.menu());
    }
}

