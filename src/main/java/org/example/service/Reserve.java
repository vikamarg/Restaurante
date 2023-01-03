package org.example.service;

import org.example.enums.ReservationStatus;
import org.example.enums.Zone;

import java.util.Date;
import java.util.Random;

public class Reserve {

    private String reserver;
    private Date datetimeOfReservation ;
    private int contactNumber;
    private int numberOfGuests;
    private Zone zone;
    private String additionalPreferance;

    private ReservationStatus reservationStatus;

    private int sentCode;

    public Reserve(){}

    public Reserve(final String nameOfReserver, final Date datetimeOfReservation, final int contactNumber,
                   final int numberOfGuests, final Zone preferedZone, final String additionalPreferance)
    {
        this.reserver = nameOfReserver;
        this.datetimeOfReservation = datetimeOfReservation;
        this.contactNumber = contactNumber;
        this.numberOfGuests = numberOfGuests;
        this.zone = preferedZone;
        this.additionalPreferance = additionalPreferance;
        setConfirmationNumber();
        this.reservationStatus = ReservationStatus.PENDING;
    }

    public String getReserver() {
        return reserver;
    }

    public void setReserver(final String nameOfReserver) {
        this.reserver = nameOfReserver;
    }

    public Date getDatetimeOfReservation() {
        return datetimeOfReservation;
    }

    public void setDatetimeOfReservation(final Date datetimeOfReservation) {
        this.datetimeOfReservation = datetimeOfReservation;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(final int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(final int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(final Zone preferedZone) {
        this.zone = preferedZone;
    }

    public int getSentCode() {
        return sentCode;
    }

    private void setConfirmationNumber() {
        Random rnd = new Random();
        this.sentCode = rnd.nextInt(1000, 99999);
    }

    public String getAdditionalPreferance() {
        return additionalPreferance;
    }

    public void setAdditionalPreferance(final String additionalPreferance) {
        this.additionalPreferance = additionalPreferance;
    }

    public void confirmeReservation(){
        /* To Do */
        /* SMS confirmation with API*/
        /* Save in DB*/
    }
}
