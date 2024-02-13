package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicle_id;

    @Column(length = 50 , nullable = false)
    private String vehicle_model;
    @Column(nullable = false)
    private String vehicle_number;
    private int vehicle_subcategory_id;
    @Column(length = 50 , nullable = false)
    private String color;
    @Column(nullable = false)
    private int location_id;
    @Column(nullable = false)
    private int fuel_type_id;
    @Column(nullable = false)
    private int avaliability_status;
    @Column(length = 500 , nullable = false)
    private String vehicle_image_url;

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getVehicle_model() {
        return vehicle_model;
    }

    public void setVehicle_model(String vehicle_model) {
        this.vehicle_model = vehicle_model;
    }

    public String getVehicle_number() {
        return vehicle_number;
    }

    public void setVehicle_number(String vehicle_number) {
        this.vehicle_number = vehicle_number;
    }

    public int getVehicle_subcategory_id() {
        return vehicle_subcategory_id;
    }

    public void setVehicle_subcategory_id(int vehicle_subcategory_id) {
        this.vehicle_subcategory_id = vehicle_subcategory_id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public int getFuel_type_id() {
        return fuel_type_id;
    }

    public void setFuel_type_id(int fuel_type_id) {
        this.fuel_type_id = fuel_type_id;
    }

    public int getAvaliability_status() {
        return avaliability_status;
    }

    public void setAvaliability_status(int avaliability_status) {
        this.avaliability_status = avaliability_status;
    }

    public String getVehicle_image_url() {
        return vehicle_image_url;
    }

    public void setVehicle_image_url(String vehicle_image_url) {
        this.vehicle_image_url = vehicle_image_url;
    }

    @Override
    public String toString() {
        return "vehicle{" +
                "vehicle_id=" + vehicle_id +
                ", vehicle_model='" + vehicle_model + '\'' +
                ", vehicle_number='" + vehicle_number + '\'' +
                ", vehicle_subcategory_id=" + vehicle_subcategory_id +
                ", color='" + color + '\'' +
                ", location_id=" + location_id +
                ", fuel_type_id=" + fuel_type_id +
                ", avaliability_status=" + avaliability_status +
                ", vehicle_image_url='" + vehicle_image_url + '\'' +
                '}';
    }
}
