package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieLibraryTest {

    private MovieLibrary movieLibrary;

    @Before
    public void setUp() throws Exception {
        movieLibrary = new MovieLibrary();
    }

    @Test
    public void testInitMovieLibrary() {
        assertEquals(4, movieLibrary.getAvailableMovies().size());
        assertEquals("The Social Network", movieLibrary.getAvailableMovies().get(0).getName());
    }

    @Test
    public void testGetAvailableMovies() {
        movieLibrary.setBorrowedMovie(3);
        assertEquals(3, movieLibrary.getAvailableMovies().size());
        assertEquals("The Social Network", movieLibrary.getAvailableMovies().get(0).getName());
    }

    @Test
    public void testGetBorrowedMovies() {
        movieLibrary.setBorrowedMovie(1);
        assertEquals(1, movieLibrary.getBorrowedMovies().size());
        assertEquals("The Social Network", movieLibrary.getBorrowedMovies().get(0).getName());
    }

    @Test
    public void testGetMovies() {
        movieLibrary.setBorrowedMovie(4);
        movieLibrary.setBorrowedMovie(3);
        assertEquals(2, movieLibrary.getMovies(true).size());
        assertEquals(2, movieLibrary.getMovies(false).size());
    }

    @Test
    public void testSetBorrowedMovie() throws Exception {
        assertEquals("The Matrix", movieLibrary.setBorrowedMovie(4).getName());
        assertEquals("Mimi O'Connor", movieLibrary.setBorrowedMovie(3).getDirector());
    }

    @Test
    public void testSetReturnMovie() throws Exception {
        movieLibrary.setBorrowedMovie(1);
        assertEquals("The Social Network", movieLibrary.setReturnMovie(1).getName());
    }

    @Test
    public void testListMovieLibrary() throws Exception {
        String movieLibraryInfo = "-----------------------------------MOVIE LIBRARY-----------------------------------\n";
        for(int i = 0; i < movieLibrary.getAvailableMovies().size(); i++) {
            movieLibraryInfo += "[" + (i + 1) + "]" + movieLibrary.getAvailableMovies().get(i).getMovieInfo();
        }
        assertEquals(movieLibraryInfo, movieLibrary.listMovies(movieLibrary.getAvailableMovies()));
    }
}
