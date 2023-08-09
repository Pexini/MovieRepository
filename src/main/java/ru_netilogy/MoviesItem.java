package ru_netilogy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MoviesItem {
    private String MovieName;
    private String FilmGenre;
    private LocalDate ReleaseDate;


}

