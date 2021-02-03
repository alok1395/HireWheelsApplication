package com.upgrad.hirewheels.vallidator;

import com.upgrad.hirewheels.dto.BookingDTO;
import com.upgrad.hirewheels.dto.VehicleDTO;
import com.upgrad.hirewheels.exceptions.APIException;

import java.text.ParseException;

public interface AdminVallidator {
    public void changeVehicleAvailability (VehicleDTO vehicleDTO) throws ParseException, APIException;
    public void addVehicle  (VehicleDTO vehicleDTO) throws ParseException, APIException;



}
