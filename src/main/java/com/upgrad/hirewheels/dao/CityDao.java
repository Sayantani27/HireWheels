package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.city;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<city,Integer> {
}
