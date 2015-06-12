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
    public void testInitBookLibrary() {
        assertEquals(6, bookLibrary.getBookLibrary().size());
        assertEquals("Martin Fowler", bookLibrary.getBookLibrary().get(0).getAuthor());
    }
}
