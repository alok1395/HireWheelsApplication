package com.upgrad.hirewheels.vallidator;

import com.upgrad.hirewheels.dto.VehicleDTO;
import com.upgrad.hirewheels.exceptions.APIException;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;

public class AdminVallidatorImpl  implements AdminVallidator{

    @Autowired
    VehicleDTO vehicleDTO;
    @Override
    public void changeVehicleAvailability(VehicleDTO vehicleDTO) throws ParseException, APIException {
        if(vehicleDTO.getAvailability_status()  != "0" || vehicleDTO.getAvailability_status()  != "1" )
            throw new APIException("Invalid status value");
    }

    @Override
    public void addVehicle(VehicleDTO vehicleDTO) throws ParseException, APIException {
        if(vehicleDTO.getVehicle_id()  < 0 )
            throw new APIException("Fields shouldn’t be null or empty");
        if(vehicleDTO.getLocation_id()  < 0 )
            throw new APIException("Invalid Location Id for vehicle");


    }
}
