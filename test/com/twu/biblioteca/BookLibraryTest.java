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
    public void testBookLibrary() throws Exception {
        assertEquals("Refactoring: Improving the Design of Existing Code", bookLibrary.getName());
        assertEquals("Martin Fowler", book.getAuthor());
        assertEquals("July 8, 1999", book.getPublishedyear());
    }

}
