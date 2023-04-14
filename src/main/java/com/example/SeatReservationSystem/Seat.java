package com.example.SeatReservationSystem;

import java.util.Date;

public class Seat {
    private int seatNo;
    private int employeeId;
    private Date date;
    private boolean reserved;

    public Seat()
    {

    }
    public Seat(int seatNo, int employeeId, Date date, boolean reserved) {
        this.seatNo = seatNo;
        this.employeeId = employeeId;
        this.date = date;
        this.reserved = reserved;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
}
