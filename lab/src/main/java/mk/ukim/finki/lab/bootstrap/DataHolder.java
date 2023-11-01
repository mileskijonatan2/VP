package mk.ukim.finki.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.lab.model.Movie;
import mk.ukim.finki.lab.model.TicketOrder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class DataHolder {
    public static List<Movie> movies = null;
    public static List<TicketOrder> ticketOrders = null;


    @PostConstruct
    public void init(){
        Random rnd = new Random();
        String [] titles = {"The Shawshank Redemption", "The Godfather", "Pulp Fiction", "The Dark Knight", "Schindler's List", "Forrest Gump", "The Matrix", "Inception", "Gladiator", "Titanic"};
        movies = new ArrayList<>();
        for(int i=0; i<10; i++){
            movies.add(new Movie(titles[i], titles[i]+" summary", rnd.nextDouble(10.01)));
        }
        ticketOrders = new ArrayList<>();
    }
}
