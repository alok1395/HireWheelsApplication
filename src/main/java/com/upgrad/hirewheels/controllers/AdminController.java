package com.upgrad.hirewheels.controllers;

import com.upgrad.hirewheels.dto.VehicleDTO;
import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.exceptions.VehicleDetailsNotFoundException;
import com.upgrad.hirewheels.services.AdminService;
import com.upgrad.hirewheels.services.VehicleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AdminController {


    @Autowired
    AdminService adminService;

    @Autowired
    ModelMapper modelmapper;

    @PostMapping(value = "/hirewheels/v1/vehicles", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addVehicle(@RequestBody VehicleDTO vehicleDTO) {
        Vehicle newVehicle = modelmapper.map(vehicleDTO, Vehicle.class);
        Vehicle savedVehicle = adminService.registerVehicle(newVehicle);
        VehicleDTO savedVehicleDTO = modelmapper.map(savedVehicle, VehicleDTO.class);
        return new ResponseEntity<>(savedVehicleDTO, HttpStatus.CREATED);
    }

    @PutMapping(value = "‘/hirewheels/v1/vehicles/{vehicleid}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity changeVehicleAvailability(@PathVariable(name = "vehicleid") int id, @RequestBody
            VehicleDTO vehicleDTO) throws VehicleDetailsNotFoundException {
        Vehicle newVehicle = modelmapper.map(vehicleDTO, Vehicle.class);
        Vehicle updatedVehicle = adminService.changeAvailability(id, newVehicle);
        VehicleDTO updatedVehicleDTO = modelmapper.map(updatedVehicle, VehicleDTO.class);
        return new ResponseEntity<>(updatedVehicleDTO, HttpStatus.OK);
    }

}