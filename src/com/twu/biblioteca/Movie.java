package com.twu.biblioteca;

public class Movie {

    private User user;
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

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMovieInfo() {
        return " BookName: " + this.name + " Year: " + this.year +
               " Director: " + this.director + " MovieRating: "+ this.movieRating +'\n';
    }

    public String getMovieInfoWithBorrower() {
        return " BookName: " + this.name + " Year: " + this.year + " Director: " + this.director +
               " MovieRating: "+ this.movieRating + " Loaned To: " + this.user.getName() + '\n';
    }
}
