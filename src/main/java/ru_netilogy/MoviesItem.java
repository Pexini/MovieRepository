package ru_netilogy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MoviesItem {
    private String MovieName;
    private String FilmGenre;
    private int ReleaseDate;

}
