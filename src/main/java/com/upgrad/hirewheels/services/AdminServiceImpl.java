package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.VehicleDao;
import com.upgrad.hirewheels.entities.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    VehicleDao vehicleDao;

    public Vehicle registerVehicle(Vehicle vehicle) {
       // registerVehicle(Vehicle vehicle).setAvailability_status("1");
        return null;
    }

    public Vehicle changeAvailability(int id, Vehicle vehicle) {
        //changeAvailability().setAvailability_status("0");
        return null;
    }

}
