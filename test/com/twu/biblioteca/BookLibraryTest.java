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

    @Test
    public void testListBookLibrary() throws Exception {
        String bookLibraryInfo = "-----------------------------------BOOK LIBRARY-----------------------------------\n";
        for(int i = 0; i < bookLibrary.getBookLibrary().size(); i++) {
            bookLibraryInfo += "[" + (i + 1) + "]" + bookLibrary.getBookLibrary().get(i).getBookInfo();
        }
        assertEquals(bookLibraryInfo, bookLibrary.listBookLibrary());
    }

}
