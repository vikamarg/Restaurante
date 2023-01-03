package org.example.service;

import org.example.enums.Roles;

public class Administrator extends Staff {

    public Administrator(String employeeName,  boolean available) {
        super(employeeName, Roles.ADMIN, available);
    }

    public void addTable(){
        /* TO DO */
    }

    public void removeTable(){
        /* TO DO */
    }

    public void addEmployee(){
        /* TO DO */
    }

    public void removeEmployee(){
        /* TO DO */
    }

    public void approveReservation( final Reserve reserve){
        /* To Do */
    }

    public void rejectReservation( final Reserve reserve){
        /* To Do */
    }

    public void setReservationTable( final Reserve reserve){
        /* To Do */
    }
}
