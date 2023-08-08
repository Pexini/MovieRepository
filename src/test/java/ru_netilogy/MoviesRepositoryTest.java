package ru_netilogy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoviesRepositoryTest {
    MoviesItem movies1 = new MoviesItem("Бладшот", "Боевик",2023/5/12);
    MoviesItem movies2 = new MoviesItem("Вперед", "Мультфильм", 2023/4/5);
    MoviesItem movies3 = new MoviesItem("Отель Белград", "Комедия", 2023/5/2);
    MoviesItem movies4 = new MoviesItem("Джентельмены", "Боевик", 2023/7/17);
    MoviesItem movies5 = new MoviesItem("Человек невидимка", "Ужасы", 2023/11/5);
    MoviesItem movies6 = new MoviesItem("Тролли. Мировой Тур", "Мультики", 2023/3/19);
    MoviesItem movies7 = new MoviesItem("Номер Один", "Комедия", 2023/02/19);



    @Test
    public void test(){
        MoviesRepository repo = new MoviesRepository();
        repo.addMovie(movies1);
        repo.addMovie(movies2);
        repo.addMovie(movies3);
        repo.addMovie(movies4);
        repo.addMovie(movies5);
        repo.addMovie(movies6);
        repo.addMovie(movies7);


        MoviesItem[] expected = {movies1, movies2, movies3, movies4, movies5, movies6, movies7};
        MoviesItem[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected,actual);
    }


}