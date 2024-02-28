package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Vehicle;

public interface AdminService {
    /*TODO write code here */
    Vehicle registerVehicle(Vehicle vehicle);
    Vehicle changeAvalibility(int vehicleId , int avalibilityStatus);

}
