package mk.ukim.finki.lab.service;

import mk.ukim.finki.lab.model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> listAll();
    List<Movie> searchMovies(String text);
}
