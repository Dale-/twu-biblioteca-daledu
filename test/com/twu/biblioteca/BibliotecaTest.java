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
        assertEquals("---------- WELCOME TO BIBLIOTECA ----------", biblioteca.welcome());
    }
}

