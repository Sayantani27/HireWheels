package com.upgrad.hirewheels.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int booking_id;

    @Column(nullable = false)
    private LocalDateTime pickup_date;
    @Column(nullable = false)
    private LocalDateTime dropoff_date;
    @Column(nullable = false)
    private LocalDateTime booking_date;
    @Column(nullable = false )
    private float amount;
    @Column(nullable = false )
    private int location_id;
    @Column(nullable = false )
    private int vehicle_id;
    @Column(nullable = false )
    private int user_id;

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public LocalDateTime getPickup_date() {
        return pickup_date;
    }

    public void setPickup_date(LocalDateTime pickup_date) {
        this.pickup_date = pickup_date;
    }

    public LocalDateTime getDropoff_date() {
        return dropoff_date;
    }

    public void setDropoff_date(LocalDateTime dropoff_date) {
        this.dropoff_date = dropoff_date;
    }

    public LocalDateTime getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(LocalDateTime booking_date) {
        this.booking_date = booking_date;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "booking{" +
                "booking_id=" + booking_id +
                ", pickup_date=" + pickup_date +
                ", dropoff_date=" + dropoff_date +
                ", booking_date=" + booking_date +
                ", amount=" + amount +
                ", location_id=" + location_id +
                ", vehicle_id=" + vehicle_id +
                ", user_id=" + user_id +
                '}';
    }
}
