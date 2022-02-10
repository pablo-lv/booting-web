package com.pablo.bootingweb.models;

public class StaffMember {

    private String employeeId;
    private String fistName;
    private String lastName;
    private Position position;

    public StaffMember() {}

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public StaffMember(String employeeId, String fistName, String lastName, Position position) {
        this.employeeId = employeeId;
        this.fistName = fistName;
        this.lastName = lastName;
        this.position = position;
    }
}
