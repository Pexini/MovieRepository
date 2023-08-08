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
//
//    public String[] findLast();
//
//    {
}
