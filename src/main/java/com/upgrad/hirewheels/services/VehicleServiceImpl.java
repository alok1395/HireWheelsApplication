package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.VehicleDao;
import com.upgrad.hirewheels.entities.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService{

  // private Example pageRequest;
    @Autowired
    VehicleDao vehicleDao;

    public List<Vehicle> getAllVehicles(){
        //return VehicleDao.findAll();
       return null;
    }

    public List<Vehicle> getAvailableVehicles(){
        return null;
    }
}
