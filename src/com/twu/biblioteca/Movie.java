package com.twu.biblioteca;

public class Movie {

    private String name;
    private String year;
    private String director;
    private int movieRating;
    private Boolean isBorrowed;

    public Movie(String name, String year, String director, int movieRating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.movieRating = movieRating;
        this.isBorrowed = false;
    }

    public String getName() {
        return this.name;
    }

    public String getYear() {
        return this.year;
    }

    public String getDirector() {
        return this.director;
    }

    public int getMovieRating() {
        return this.movieRating;
    }

    public Boolean getIsBorrowed() {

        return this.isBorrowed;
    }

    public void setIsBorrowed(Boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public String getMovieInfo() {
        return " BookName: " + this.name + " Year: " + this.year +
               " Director: " + this.director + " MovieRating: "+ this.movieRating +'\n';
    }
}
