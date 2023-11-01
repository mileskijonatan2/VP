package mk.ukim.finki.lab.repository;

import mk.ukim.finki.lab.bootstrap.DataHolder;
import mk.ukim.finki.lab.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class MovieRepository {
    public List<Movie> findAll(){
        return DataHolder.movies;
    }

    public List<Movie> searchMovies(String text){
        return DataHolder.movies.stream().filter(m->m.getTitle().contains(text)||m.getSummary().contains(text)).collect(Collectors.toList());
    }

}
