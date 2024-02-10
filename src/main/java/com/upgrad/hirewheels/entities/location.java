package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
public class location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int location_id;

    @Column(length = 50 , nullable = false)
    private String location_name;
    @Column(length = 100 , nullable = false)
    private String address;
    @Column(nullable = false)
    private int city_id;
    @Column(length = 6 , nullable = false)
    private String pincode;

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public String getLocation_name() {
        return location_name;
    }

    public void setLocation_name(String location_name) {
        this.location_name = location_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "location{" +
                "location_id=" + location_id +
                ", location_name='" + location_name + '\'' +
                ", address='" + address + '\'' +
                ", city_id=" + city_id +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
