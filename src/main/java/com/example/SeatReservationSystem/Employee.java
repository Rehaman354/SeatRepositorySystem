package com.example.SeatReservationSystem;

public class Employee {
    private int EmployeeId;
    private String team;
    public Employee()
    {

    }
    public Employee(int employeeId, String team) {
        EmployeeId = employeeId;
        this.team = team;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
