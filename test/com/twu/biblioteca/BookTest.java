package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;
    private BookLibrary bookLibrary;

    @Before
    public void setUp() throws Exception {
        bookLibrary = new BookLibrary();
        book = new Book("Refactoring: Improving the Design of Existing Code", "Martin Fowler", "July 8, 1999");
    }

    @Test
    public void testBook() throws Exception {
        assertEquals("Refactoring: Improving the Design of Existing Code", book.getName());
        assertEquals("Martin Fowler", book.getAuthor());
        assertEquals("July 8, 1999", book.getPublishedyear());
    }

    @Test
    public void testGetBookInfo() throws Exception {
        assertEquals(" BookName: " + book.getName() + " Author: " + book.getAuthor() +
                     " PublishedYear: " + book.getPublishedyear() + "\n", book.getBookInfo());
    }


}
