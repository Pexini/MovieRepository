package ru_netilogy;

public class MoviesRepository {
    private MoviesItem[] movies = new MoviesItem[0];


    public void addMovie(MoviesItem movie) {
        MoviesItem[] tmp = new MoviesItem[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public MoviesItem[] findAll() {
        return movies;
    }


    public MoviesItem[] findLast() {
        int resultLength;
        if (movies.length < 5) {
            resultLength = movies.length;
        } else {
            resultLength = 5;
        }
        MoviesItem[] tmp = new MoviesItem[resultLength];
        for (int i = 0; i < tmp.length; i++) {

            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}



