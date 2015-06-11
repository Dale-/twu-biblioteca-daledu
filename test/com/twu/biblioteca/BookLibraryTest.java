package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookLibraryTest {

    private BookLibrary bookLibrary;

    @Before
    public void setUp() throws Exception {
        bookLibrary = new BookLibrary();
    }

    @Test
    public void testBooks() {
        assertEquals(6, BookLibrary.Books().size());
        assertEquals("Martin Fowler", BookLibrary.Books().get(0).getAuthor());
    }
}
