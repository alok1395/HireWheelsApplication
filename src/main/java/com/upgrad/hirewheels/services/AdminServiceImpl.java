package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Vehicle;

public class AdminServiceImpl {
    public Vehicle registerVehicle() {
        registerVehicle().setAvailability_status("1");
        return null;
    }

    public Vehicle changeAvailability() {
        changeAvailability().setAvailability_status("0");
        return null;
    }

}
