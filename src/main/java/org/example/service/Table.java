package org.example.service;

import org.example.enums.Zone;

public class Table {
    private int id;
    private int numberOfPersons;
    private Zone zone;
    private boolean isAvailable;
    private String waiter;

    public Table(int numberOfPersons, Zone zone, boolean isAvailable, String waiter) {
        this.numberOfPersons = numberOfPersons;
        this.zone = zone;
        this.isAvailable = isAvailable;
        this.waiter = waiter;
    }
}
