package lt.techin.cinema.controllers;

import lt.techin.cinema.entities.CinemaTheatre;
import lt.techin.cinema.services.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/seats")
public class SeatController {

    private final SeatService seatService;

    @Autowired
    public SeatController(SeatService seatService) {
        this.seatService = seatService;
    }

    @GetMapping()
    public CinemaTheatre getCinemaSeatInfo() {
        return seatService.getCinemaSeatInfo();
    }

}
