package com.example.SeatReservationSystem;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Repository
public class ReservationRepository {
    HashMap<Integer,Seat>  seatdb=new HashMap<>();
    HashMap<Integer,Employee> employeedb=new HashMap<>();
    HashMap<Integer, List<Seat>> employeeSeatdb=new HashMap<>();//employeeId-> seats


    public String addSeat(Seat seat) {
        seatdb.put(seat.getSeatNo(),seat);
        if(employeeSeatdb.containsKey(seat.getEmployeeId()))
        {
            employeeSeatdb.get(seat.getEmployeeId()).add(seat);
        }
        else {
            List<Seat> seats=new ArrayList<>();
            seats.add(seat);
            employeeSeatdb.put(seat.getEmployeeId(),seats);
        }

        return "Seat added";
    }

    public String addEmployee(Employee employee) {
        employeedb.put(employee.getEmployeeId(),employee);
        return "Employee added";
    }

    public int vacantSeats(Date date) {
        int count=0;
     for(Seat seat :seatdb.values())
     {
        if(seat.getDate().compareTo(date)==0 && !seat.isReserved())
            count++;
     }
     return count;
    }

    public int employeeCount() {
        int count=0;
        for(Integer num:employeeSeatdb.keySet())
        {
            if(employeeSeatdb.get(num).size()>5)count++;
        }
        return count;
    }

    public int employeeByTeam(String team, Date date) {
        int count=0;
        for(Seat seat:seatdb.values())
        {
            if(seat.getDate().compareTo(date)==0)
            {
                Employee employee=employeedb.get(seat.getEmployeeId());
                if(employee.getTeam().equals(team))
                    count++;
            }
        }
        return count;
    }
}
