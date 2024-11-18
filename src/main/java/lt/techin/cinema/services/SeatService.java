package lt.techin.cinema.services;

import jakarta.annotation.PostConstruct;
import lt.techin.cinema.entities.CinemaTheatre;
import lt.techin.cinema.entities.Seat;
import org.springframework.stereotype.Service;


@Service
public class SeatService {

    private CinemaTheatre cinemaTheatre = new CinemaTheatre();

    public CinemaTheatre getCinemaSeatInfo() {
        return cinemaTheatre;
    }


    @PostConstruct
    public void init() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                Seat seat = new Seat(i, j);
                cinemaTheatre.getSeats().add(seat);
            }
        }
    }

}
