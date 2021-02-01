package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicle_id;

    @Column(length = 50, nullable = false)
    private String vehicle_model;

    @Column(length = 10, nullable = false)
    private int vehicle_number;


    private int vehicle_subcategory_id;

    @Column(length = 50, nullable = false)
    private String color;

    private int location_id;

    private int fuel_type_id;

    @Column(length = 1, nullable = false)
    private String availability_status;

    @Column(length = 500, nullable = false)
    private String vehicle_image_url;

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicle_id=" + vehicle_id +
                ", vehicle_model='" + vehicle_model + '\'' +
                ", vehicle_number=" + vehicle_number +
                ", vehicle_subcategory_id=" + vehicle_subcategory_id +
                ", color='" + color + '\'' +
                ", location_id=" + location_id +
                ", fuel_type_id=" + fuel_type_id +
                ", availability_status='" + availability_status + '\'' +
                ", vehicle_image_url='" + vehicle_image_url + '\'' +
                '}';
    }

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
