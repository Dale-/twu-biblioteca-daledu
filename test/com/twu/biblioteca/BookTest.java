package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void setUp() throws Exception {
        book = new Book("Refactoring: Improving the Design of Existing Code", "Martin Fowler", "July 8, 1999");
    }

    @Test
    public void testBook() throws Exception {
        assertEquals("Refactoring: Improving the Design of Existing Code", book.getName());
        assertEquals("Martin Fowler", book.getAuthor());
        assertEquals("July 8, 1999", book.getPublishedyear());
    }

    public void testGetBookInfo() throws Exception {
        assertEquals("BookName: " + book.getName() + " Author: " + book.getAuthor() + " PublishedYear: " + book.getPublishedyear(),book.getBookInfo());
    }

    public void testBookLibrary() throws Exception {
        assertEquals(6, BookLibrary.size);
        assertEquals("Martin Fowler", BookLibrary(0).getAuthor());
    }

}
