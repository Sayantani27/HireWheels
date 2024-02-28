package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.VehicleDao;
import com.upgrad.hirewheels.entities.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    VehicleDao vehicleDao;

    @Override
    public Vehicle registerVehicle(Vehicle vehicle) {
        boolean testVehicleNumber = vehicleDao.existsByVehicleNumber(vehicle.getVehicleNumber());
        if (testVehicleNumber){
            System.out.println("Vehicle Nu,ber Already Exists");
        }
        Vehicle savedVehicle = vehicleDao.save(vehicle);
        savedVehicle.setAvaliabilityStatus(1);
        return savedVehicle;
    }

    /**
     * This method changes the availability_status field of the vehicle based on the input parameters.
     * If the availability_status = 0, then the vehicle is not avaliable for booking. Similarly,
     * If the availability_status = 1,then the vehicle is avaliable for booking.
     * @param vehicleId
     * @param avalibilityStatus
     * @return
     */
    @Override
    public Vehicle changeAvalibility(int vehicleId, int avalibilityStatus) {
        Vehicle vehicle = vehicleDao.findById(vehicleId).get();
        vehicle.setAvaliabilityStatus(avalibilityStatus);
        return vehicleDao.save(vehicle);
    }

    /**
     * This method interacts with the VehicleDao to store vehicle's data into the database.
     * @parm vehicle
     * @return
     */

}
