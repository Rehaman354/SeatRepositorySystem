package com.example.SeatReservationSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/srs")
public class ReservationController {
    @Autowired
    ReservationService reservationService;
    @PostMapping("/add-seat")
    public String addSeat(@RequestBody Seat seat)
    {
        return reservationService.addSeat(seat);
    }
    @PostMapping("/add-employee")
    public String addEmployee(@RequestBody Employee employee)
    {
        return reservationService.addEmployee(employee);
    }
    @GetMapping("/vacantSeatsOnDate")
    public int vacantSeats(@RequestParam("date") Date date)
    {
        return reservationService.vacantSeats(date);
    }
    @GetMapping("/employeeCameMoreThan5")
    public int employeeCount()
    {
        return reservationService.employeeCount();
    }
    @GetMapping("/employeeByTeamAndDate")
    public int employeesByTeam(@RequestParam("team") String team,@RequestParam("date")Date date)
    {
        return reservationService.employeeByTeam(team,date);
    }
}
