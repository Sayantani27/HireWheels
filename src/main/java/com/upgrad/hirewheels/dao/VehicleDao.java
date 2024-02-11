package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleDao extends JpaRepository<vehicle,Integer> {
}
