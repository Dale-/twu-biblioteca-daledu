package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        bookLibrary.setBorrowedBook(6);
        bookLibrary.setBorrowedBook(5);
        assertEquals(2, bookLibrary.getBooks(true).size());
        assertEquals(4, bookLibrary.getBooks(false).size());
    }

    @Test
    public void testSetBorrowedBook() throws Exception {
        assertEquals("Head First Java", bookLibrary.setBorrowedBook(6).getName());
        assertEquals("Martin Odersky", bookLibrary.setBorrowedBook(5).getAuthor());
    }

    @Test
    public void testSetReturnBook() throws Exception {
        bookLibrary.setBorrowedBook(1);
        assertEquals("Refactoring", bookLibrary.setReturnBook(1).getName());
    }

    @Test
    public void testListBookLibrary() throws Exception {
        String bookLibraryInfo = "-----------------------------------BOOK LIBRARY-----------------------------------\n";
        for(int i = 0; i < bookLibrary.getAvailableBooks().size(); i++) {
            bookLibraryInfo += "[" + (i + 1) + "]" + bookLibrary.getAvailableBooks().get(i).getBookInfo();
        }
        assertEquals(bookLibraryInfo, bookLibrary.listBooks(bookLibrary.getAvailableBooks()));
    }

}
