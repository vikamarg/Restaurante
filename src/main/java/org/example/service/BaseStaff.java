package org.example.service;

import org.example.enums.Roles;

public abstract class BaseStaff {
    private int employeeId;
    private String employeeName ;
    private Roles role;
    private boolean availability;

    public BaseStaff(){}

    public BaseStaff(int employeeId, String employeeName, Roles role, boolean available) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.role = role;
        this.availability = available ;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(final String employeeName) {
        this.employeeName = employeeName;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(final Roles role) {
        this.role = role;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(final boolean availability) {

        this.availability = availability;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
