package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<role,Integer> {
}
