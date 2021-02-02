package com.upgrad.hirewheels.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FuelType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int fuel_type_id;

    @Column(length = 50, nullable = false , unique = true)
    private String fuel_type;

    @OneToMany (mappedBy = "fuelType", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private Set<Vehicle> vehicle;

    public int getFuel_type_id() {
        return fuel_type_id;
    }
    public void setFuel_type_id(int fuel_type_id) {
        this.fuel_type_id = fuel_type_id;
    }

    public String getFuel_type() {
        return fuel_type;
    }
    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public Set<Vehicle> getVehicle() {
        return vehicle;
    }
    public void setVehicle(Set<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "FuelType{" +
                "fuel_type_id=" + fuel_type_id +
                ", fuel_type='" + fuel_type +
                ", Vehicle_id" + vehicle + '\'' +
                '}';
    }
}
