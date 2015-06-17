package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookLibraryTest {

    private BookLibrary bookLibrary;

    @Before
    public void setUp() throws Exception {
        bookLibrary = new BookLibrary();
    }

    @Test
    public void testInitBookLibrary() {
        assertEquals(6, bookLibrary.getAvailableBooks().size());
        assertEquals("Martin Fowler", bookLibrary.getAvailableBooks().get(0).getAuthor());
    }

    @Test
    public void testGetAvailableBooks() {
        bookLibrary.setBorrowedBook(3);
        assertEquals(5, bookLibrary.getAvailableBooks().size());
        assertEquals("Martin Fowler", bookLibrary.getAvailableBooks().get(0).getAuthor());
    }

    @Test
    public void testGetBorrowedBooks() {
        bookLibrary.setBorrowedBook(1);
        assertEquals(1, bookLibrary.getBorrowedBooks().size());
        assertEquals("Martin Fowler", bookLibrary.getBorrowedBooks().get(0).getAuthor());
    }

    @Test
    public void testGetBooks() {
        
    }

    @Test
    public void testListBookLibrary() throws Exception {
        String bookLibraryInfo = "-----------------------------------BOOK LIBRARY-----------------------------------\n";
        for(int i = 0; i < bookLibrary.getAvailableBooks().size(); i++) {
            bookLibraryInfo += "[" + (i + 1) + "]" + bookLibrary.getAvailableBooks().get(i).getBookInfo();
        }
        assertEquals(bookLibraryInfo, bookLibrary.listBooks(bookLibrary.getAvailableBooks()));
    }

    @Test
    public void testSetBorrowedBook() throws Exception {
        bookLibrary.setBorrowedBook(1);
        assertEquals(1, bookLibrary.getBorrowedBooks().size());
    }

    @Test
    public void testSetLibraryBook() throws Exception {
        bookLibrary.setBorrowedBook(1);
        bookLibrary.setLibraryBook(1);
        assertEquals(7, bookLibrary.getAvailableBooks().size());
    }
}
