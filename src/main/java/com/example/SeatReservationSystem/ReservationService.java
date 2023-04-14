package com.example.SeatReservationSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReservationService {
    @Autowired
    ReservationRepository reservationRepository;
    public String addSeat(Seat seat) {
        return reservationRepository.addSeat(seat);
    }

    public String addEmployee(Employee employee) {
        return reservationRepository.addEmployee(employee);
    }

    public int vacantSeats(Date date) {
        return reservationRepository.vacantSeats(date);
    }

    public int employeeCount() {
        return reservationRepository.employeeCount();
    }

    public int employeeByTeam(String team, Date date) {
        return reservationRepository.employeeByTeam(team,date);
    }
}
