package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void setUp() throws Exception {
        book = new Book("Refactoring: Improving the Design of Existing Code", " Martin Fowler", "July 8, 1999");
    }

    @Test
    public void testBook() throws Exception {
        assertEquals("Refactoring: Improving the Design of Existing Code", book.name);
        assertEquals("Refactoring: Improving the Design of Existing Code", book.author);
        assertEquals("Refactoring: Improving the Design of Existing Code", book.publishedyear);
    }

}
