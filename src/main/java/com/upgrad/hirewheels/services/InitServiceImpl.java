package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.*;
import com.upgrad.hirewheels.entities.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitServiceImpl implements InitService{
    @Autowired
    UserRoleDAO userRoleDAO;
    @Autowired
    UserDAO userDAO;
    @Autowired
    VehicleCategoryDAO vehicleCategoryDAO;
    @Autowired
    VehicleSubcategoryDAO vehicleSubcategoryDAO;
    @Autowired
    CityDAO cityDAO;
    @Autowired
    FuelTypeDAO fuelTypeDAO;
    @Autowired
    LocationDAO locationDAO;
    @Autowired
    DTOEntityConverter dtoEntityConverter;

    public void start(){
        addUserRole();
        addUsers();
        addVehicleCategory();
        addVehicleSubCategory();
        addCity();
        addFuelType();
        addLocation();
    }

    private void addLocation(){
        Location location = new Location(1,"Worli","Dr E Mose Rd, Worli Naka, Upper Worli",400018,cityDAO.findById(1).get());
        locationDAO.save(location);
        location = new Location(2,"Chembur","Optic Complex",400019,cityDAO.findById(1).get());
        locationDAO.save(location);
        location = new Location(3,"Powai","Hiranandani Tower",400020,findById(1).get());
        locationDAO.save(location);
    }
    private void addFuelType(){
        List<FuelType> fuelTypeList = Arrays.asList(new FuelType(1,"Petrol"),new FuelType(2,"Diesel"));
        fuelTypeDAO.saveAll(fuelTypeList);
    }
    private void addCity(){
        cityDAO.save(new City(1,"Mumbai"));
    }

    private void addVehicleCategory(){
        List<VehicleCategory> vehicleCategoryList = Arrays.asList(new VehicleCategory(10,"CAR"),
                                                                  new VehicleCategory(11,"BIKE"));
        vehicleCategoryDAO.saveAll(vehicleCategoryList);
    }

    private void addVehicleSubCategory(){
        List<VehicleSubcategory> vehicleSubcategories = new ArrayList<>();

        vehicleSubcategories.add(new VehicleSubcategory(1,"SUV",300,vehicleCategoryDAO.findByVehicleCategoryId(10)));
        vehicleSubcategories.add(new VehicleSubcategory(2,"SEDAN",350,vehicleCategoryDAO.findByVehicleCategoryId(10)));
        vehicleSubcategories.add(new VehicleSubcategory(3,"HATCHBACK",250,vehicleCategoryDAO.findByVehicleCategoryId(10)));
        vehicleSubcategories.add(new VehicleSubcategory(4,"CRUISER",200,vehicleCategoryDAO.findByVehicleCategoryId(11)));
        vehicleSubcategories.add(new VehicleSubcategory(5,"DIRT BIKE",200,vehicleCategoryDAO.findByVehicleCategoryId(11)));
        vehicleSubcategories.add(new VehicleSubcategory(6,"SPORTS BIKE",150,vehicleCategoryDAO.findByVehicleCategoryId(11)));

        vehicleSubcategoryDAO.saveAll(vehicleSubcategories);
    }

    private void addUserRole(){
        List<Role> userRoleList = Arrays.asList(new Role(1,"Admin"),
                                                    new Role(2,"User"));
        UserRoleDAO.saveAll(userRoleList);
    }

    private void addUsers(){
        User adminUser = new User("Upgrad","Admin","admin@123","upgrad@gmail.com","9999999999",10000,userRoleDAO.findByRoleId(1));
        UserDAO.save(adminUser);
    }

}
