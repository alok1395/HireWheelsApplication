package com.upgrad.hirewheels.dto;


public class VehicleDTO {

        int vehicle_id;
        String vehicle_model;
        int vehicle_number;
        int vehicle_subcategory_id;
        String color;
        int location_id;
        int fuel_type_id;
        int booking_id;
        String availability_status;
        String vehicle_image_url;

    public int getVehicle_id() {
        return vehicle_id;
    }
    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getVehicle_model() {
        return vehicle_model;
    }
    public void setVehicle_model(String vehicle_model) {
        this.vehicle_model = vehicle_model;
    }

    public int getVehicle_number() {
        return vehicle_number;
    }
    public void setVehicle_number(int vehicle_number) {
        this.vehicle_number = vehicle_number;
    }

    public int getVehicle_subcategory_id() {
        return vehicle_subcategory_id;
    }
    public void setVehicle_subcategory_id(int vehicle_subcategory_id) {
        this.vehicle_subcategory_id = vehicle_subcategory_id;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getLocation_id() {
        return location_id;
    }
    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public int getFuel_type_id() {
        return fuel_type_id;
    }
    public void setFuel_type_id(int fuel_type_id) {
        this.fuel_type_id = fuel_type_id;
    }

    public int getBooking_id() {
        return booking_id;
    }
    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public String getAvailability_status() {
        return availability_status;
    }
    public void setAvailability_status(String availability_status) {
        this.availability_status = availability_status;
    }

    public String getVehicle_image_url() {
        return vehicle_image_url;
    }
    public void setVehicle_image_url(String vehicle_image_url) {
        this.vehicle_image_url = vehicle_image_url;
    }
}
