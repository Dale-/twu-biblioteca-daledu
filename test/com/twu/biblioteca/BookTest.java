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
        assertEquals(6, Book.BookLibrary().length);
        assertEquals("Martin Fowler", Book.BookLibrary()[0].getAuthor());
    }

    public void testListBook() throws Exception {
        String bookLibraryInfo = "";
        for(int i = 0; i < Book.BookLibrary().length; i++) {
            bookLibraryInfo += Book.BookLibrary()[i].getBookInfo();
        }
        assertEquals(bookLibraryInfo,Book.listBook());
    }

}
