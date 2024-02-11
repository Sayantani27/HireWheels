package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.vehicle_subcategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleSubcategoryDao extends JpaRepository<vehicle_subcategory,Integer> {
}
