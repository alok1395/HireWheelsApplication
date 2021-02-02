package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.VehicleDao;
import com.upgrad.hirewheels.entities.Vehicle;
import org.springframework.data.domain.Example;

import java.util.List;

public class VehicleServiceImpl {

  // private Example pageRequest;

    public List<Vehicle> getAllVehicles(){
        //return VehicleDao.findAll(pageRequest);
        return null;
    }

    public List<Vehicle> getAvailableVehicles(){
        return null;
    }
}
