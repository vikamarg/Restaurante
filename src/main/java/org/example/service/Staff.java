package org.example.service;

import org.example.enums.Roles;

public class Staff extends BaseStaff{
    public Staff() {}

    public Staff(String employeeName, Roles role, boolean available) {
        super(employeeName, role, available);
        if(role == Roles.WAITER)
        {
            throw new RuntimeException("Waiter can't be created. ");
        }


    }
}
