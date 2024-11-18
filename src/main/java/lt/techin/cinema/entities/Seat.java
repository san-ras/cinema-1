package lt.techin.cinema.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class Seat {

    @Id
    private Integer row;
    private Integer column;


    public Seat(Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }
}
