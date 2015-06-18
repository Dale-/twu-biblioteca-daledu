package com.twu.biblioteca;

import java.util.ArrayList;

public class MovieLibrary {

    private ArrayList<Movie> movieLibrary;

    public MovieLibrary() {
        this.movieLibrary = this.initMovieLibrary();
    }

    public ArrayList<Movie> initMovieLibrary() {

        ArrayList<Movie> movies = new ArrayList<Movie>();

        Movie movie1 = new Movie("The Social Network", "2010", "David Fincher", 8);
        Movie movie2 = new Movie("Pirates of Silicon Valley", "1999", "Martyn Burke", 8);
        Movie movie3 = new Movie("Steve Jobs - One Last Thing", "2011", "Mimi O'Connor", 9);
        Movie movie4 = new Movie("The Matrix", "1999", "Andy Wachowski & Lana Wachowski", 9);

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);

        return movies;
    }

    public ArrayList<Movie> getAvailableMovies() {
        return this.getMovies(false);
    }

    public ArrayList<Movie> getBorrowedMovies() {
        return this.getMovies(true);
    }

    public ArrayList<Movie> getMovies(Boolean isBorrowed) {

        ArrayList<Movie> movies = new ArrayList<Movie>();

        for (Movie movie: this.movieLibrary) {
            if(movie.getIsBorrowed() == isBorrowed) {
                movies.add(movie);
            }
        }

        return movies;
    }

    public Movie setBorrowedMovie(int number) {

        Movie borrowedMovie = this.getAvailableMovies().get(number - 1);
        borrowedMovie.setIsBorrowed(true);
        return borrowedMovie;
    }

    public Movie setReturnMovie(int number) {

        Movie returnMovie = this.getBorrowedMovies().get(number - 1);
        returnMovie.setIsBorrowed(false);
        return returnMovie;
    }

    public String listMovies(ArrayList<Movie> movies) {

        String MovieLibraryInfo = "-----------------------------------MOVIE LIBRARY-----------------------------------\n";
        for(int i = 0; i < movies.size(); i++) {
            MovieLibraryInfo += "[" + (i + 1) + "]" + movies.get(i).getMovieInfo();
        }
        System.out.println(MovieLibraryInfo);

        return MovieLibraryInfo;
    }

    public String listMoviesWithBorrower(ArrayList<Movie> movies, User user) {

        String BookLibraryInfo = "-----------------------------------BOOK LIBRARY-----------------------------------\n";
        for(int i = 0; i < movies.size(); i++) {
            BookLibraryInfo += "[" + (i + 1) + "]" + movies.get(i).getMovieInfoWithBorrower();
        }
        System.out.println(BookLibraryInfo);

        return BookLibraryInfo;
    }

    public void checkoutMovie(MovieLibrary movieLibrary, User user) {

        movieLibrary.listMovies(movieLibrary.getAvailableMovies());
        System.out.println("Please input one number that you want to checkout :");
        int checkoutNumber = Integer.parseInt(InputReader.getInput());
        try {
            Movie checkoutmovie = movieLibrary.getAvailableMovies().get(checkoutNumber - 1);
            movieLibrary.getAvailableMovies().remove(checkoutNumber - 1);
            movieLibrary.setBorrowedMovie(checkoutNumber);
            checkoutmovie.setUser(user);
            System.out.println("Thank you! Enjoy the movie");
        } catch (Exception e) {
            System.out.println("That movie is not available");
            e.getMessage();
        }
    }

    public void returnMovie(MovieLibrary movieLibrary, User user) {
        movieLibrary.listMoviesWithBorrower(movieLibrary.getBorrowedMovies(), user);
        System.out.println("Please input one number that you want to return :");
        int returnNumber = Integer.parseInt(InputReader.getInput());
        try {
            movieLibrary.setReturnMovie(returnNumber);
            movieLibrary.getBorrowedMovies().remove(returnNumber - 1);
            System.out.println("Thank you for returning the movie");
        } catch (Exception e) {
            System.out.println("That is not a valid movie to return");
            e.getMessage();
        }
    }
}
