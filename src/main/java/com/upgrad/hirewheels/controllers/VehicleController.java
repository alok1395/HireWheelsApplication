package com.upgrad.hirewheels.controllers;

import com.upgrad.hirewheels.dto.VehicleDTO;
import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.exceptions.VehicleDetailsNotFoundException;
import com.upgrad.hirewheels.services.VehicleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VehicleController {


    @Autowired
    VehicleService vehicleService;

    @Autowired
    ModelMapper modelmapper;

    @GetMapping(value= {"/hirewheels/v1/vehicles"})
    public ResponseEntity<List<Vehicle>> getAllVehicles() throws VehicleDetailsNotFoundException {
        List<Vehicle> bookings = vehicleService.getAllVehicles();
        return new ResponseEntity<List<Vehicle>>(bookings, HttpStatus.OK);
    }

    @GetMapping(value = "/hirewheels/v1/vehicles")
    public ResponseEntity getAvailableVehicles() throws VehicleDetailsNotFoundException {
        List<Vehicle> vehicleList = vehicleService.getAvailableVehicles();
        List<VehicleDTO> vehicleDTOList = new ArrayList<>();
        for(Vehicle vehicle : vehicleList){
            vehicleDTOList.add(modelmapper.map(vehicle,VehicleDTO.class));
        }
        return new ResponseEntity<>(vehicleDTOList, HttpStatus.OK);
    }

}
