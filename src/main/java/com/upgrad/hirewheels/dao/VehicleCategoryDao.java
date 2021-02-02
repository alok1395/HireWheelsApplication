package com.upgrad.hirewheels.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleCategoryDao extends JpaRepository {
    Object findByVehicleCategoryId(int i);
}
