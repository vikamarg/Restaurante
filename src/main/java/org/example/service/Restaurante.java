package org.example.service;
import java.util.List;

public class Restaurante{
    private String name;

    private String address;

    private String phoneNumber;

    private List<BaseStaff> staff ;
    private List<Table> tables;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void run() {
        /* To Do */
        System.out.println("Welcome. Restaurante is open.");
    }



}
