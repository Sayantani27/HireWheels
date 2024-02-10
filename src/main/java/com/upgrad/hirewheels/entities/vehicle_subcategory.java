package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
public class vehicle_subcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicle_subcategory_id;

    @Column(length = 50 , nullable = false , unique = true)
    private String vehicle_subcategory_name;
    @Column(nullable = false)
    private float price_per_day;
    @Column(nullable = false )
    private int vehicle_category_id;

    public int getVehicle_subcategory_id() {
        return vehicle_subcategory_id;
    }

    public void setVehicle_subcategory_id(int vehicle_subcategory_id) {
        this.vehicle_subcategory_id = vehicle_subcategory_id;
    }

    public String getVehicle_subcategory_name() {
        return vehicle_subcategory_name;
    }

    public void setVehicle_subcategory_name(String vehicle_subcategory_name) {
        this.vehicle_subcategory_name = vehicle_subcategory_name;
    }

    public float getPrice_per_day() {
        return price_per_day;
    }

    public void setPrice_per_day(float price_per_day) {
        this.price_per_day = price_per_day;
    }

    public int getVehicle_category_id() {
        return vehicle_category_id;
    }

    public void setVehicle_category_id(int vehicle_category_id) {
        this.vehicle_category_id = vehicle_category_id;
    }

    @Override
    public String toString() {
        return "vehicle_subcategory{" +
                "vehicle_subcategory_id=" + vehicle_subcategory_id +
                ", vehicle_subcategory_name='" + vehicle_subcategory_name + '\'' +
                ", price_per_day=" + price_per_day +
                ", vehicle_category_id=" + vehicle_category_id +
                '}';
    }
}
