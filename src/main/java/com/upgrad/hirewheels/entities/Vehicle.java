package com.upgrad.hirewheels.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicle_id;

    @Column(length = 50, nullable = false)
    private String vehicle_model;

    @Column(length = 10, nullable = false)
    private int vehicle_number;

    @ManyToOne
    @JoinColumn(name = "vehicle_subcategory_id")
    private VehicleSubcategory vehicleSubcategory;

    @Column(length = 50, nullable = false)
    private String color;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    @ManyToOne
    @JoinColumn(name = "fuel_type_id", nullable = false)
    private FuelType fuelType;

    @OneToMany (mappedBy = "vehicle", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private Set<Booking> booking;

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
                ", vehicle_subcategory_id=" + vehicleSubcategory +
                ", color='" + color + '\'' +
                ", location_id=" + location +
                ", fuel_type_id=" + fuelType +
                ", availability_status='" + availability_status + '\'' +
                ", vehicle_image_url='" + vehicle_image_url +
                ", booking_id=" + booking + '\'' +
                '}';
    }

    public Set<Booking> getBooking() {
        return booking;
    }
    public void setBooking(Set<Booking> booking) {
        this.booking = booking;
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

    public VehicleSubcategory getVehicleSubcategory() {
        return vehicleSubcategory;
    }
    public void setVehicleSubcategory(VehicleSubcategory vehicleSubcategory) {
        this.vehicleSubcategory = vehicleSubcategory;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    public FuelType getFuelType() {
        return fuelType;
    }
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
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
