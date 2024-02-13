package com.upgrad.hirewheels.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Location {
    @Id
    private int locationId;

    @Column(length = 50 , nullable = false)
    private String locationName;
    @Column(length = 100 , nullable = false)
    private String address;
    @Column(length = 6 , nullable = false)
    private String pincode;
    @ManyToOne
    @JoinColumn(name = "city_id" , nullable = false )
    private City city;

    @OneToMany(mappedBy = "location", fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    private Set<Booking> bookingsList;

    @OneToMany(mappedBy = "location", fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    private Set<Vehicle> vehicles;

    private Location(){}

    public Location(int locationId, String locationName, String address, String pincode, City city) {
        this.locationId = locationId;
        this.locationName = locationName;
        this.address = address;
        this.pincode = pincode;
        this.city = city;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Set<Booking> getBookingsList() {
        return bookingsList;
    }

    public void setBookingsList(Set<Booking> bookingsList) {
        this.bookingsList = bookingsList;
    }

    public Set<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Set<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "Location{" +
                "locationId=" + locationId +
                ", locationName='" + locationName + '\'' +
                ", address='" + address + '\'' +
                ", pincode='" + pincode + '\'' +
                ", city=" + city +
                ", bookingsList=" + bookingsList +
                ", vehicles=" + vehicles +
                '}';
    }
}
