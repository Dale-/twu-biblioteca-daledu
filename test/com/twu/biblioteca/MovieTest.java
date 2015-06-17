package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    private Movie movie;

    @Before
    public void setUp() throws Exception {
        movie = new Movie("The Social Network", "2010", "David Fincher", 8);
    }

    @Test
    public void testMovie() throws Exception {
        assertEquals("The Social Network", movie.getName());
        assertEquals("David Fincher", movie.getDirector());
        assertEquals(8, movie.getMovieRating());
    }

    @Test
    public void testGetMovieInfo() throws Exception {
        assertEquals(" BookName: " + movie.getName() + " Year: " + movie.getYear() + " Director: " + movie.getDirector() +
                     " MovieRating: "+ movie.getMovieRating() +'\n', movie.getMovieInfo());
    }
}
