package lt.techin.cinema.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
@Getter
@Setter
public class CinemaTheatre {

    private int rows;
    private int columns;
    private List<Seat> seats;

    public CinemaTheatre() {
        this.rows = 9;
        this.columns = 9;
        this.seats = new ArrayList<>();

    }
}
