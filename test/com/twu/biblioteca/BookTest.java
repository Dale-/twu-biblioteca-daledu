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

    @Test
    public void testGetBookInfo() throws Exception {
        assertEquals(" BookName: " + book.getName() + " Author: " + book.getAuthor() +
                     " PublishedYear: " + book.getPublishedyear() + "\n", book.getBookInfo());
    }

    @Test
    public void testBookLibrary() throws Exception {
        assertEquals(6, Book.BookLibrary().length);
        assertEquals("Martin Fowler", Book.BookLibrary()[0].getAuthor());
    }

    @Test
    public void testListBookLibrary() throws Exception {
        String bookLibraryInfo = "-----------------------------------BOOK LIBRARY-----------------------------------\n";
        for(int i = 0; i < Book.BookLibrary().length; i++) {
            bookLibraryInfo += "[" + (i + 1) + "]" + Book.BookLibrary()[i].getBookInfo();
        }
        assertEquals(bookLibraryInfo, Book.listBookLibrary());
    }

}
