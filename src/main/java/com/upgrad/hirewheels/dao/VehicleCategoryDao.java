package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.vehicle_category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleCategoryDao extends JpaRepository<vehicle_category,Integer> {
}