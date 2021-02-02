package com.upgrad.hirewheels.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class VehicleCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicle_category_id;

    @Column(length = 50, nullable = false, unique = true)
    private String vehicle_category_name;

    @OneToMany (mappedBy = "vehicleCategory", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private Set<VehicleSubcategory> vehicleSubcategory;

    public VehicleCategory(int vehicle_category_id, String vehicle_category_name) {
    }


    public int getVehicle_category_id() {
        return vehicle_category_id;
    }
    public void setVehicle_category_id(int vehicle_category_id) {
        this.vehicle_category_id = vehicle_category_id;
    }

    public Set<VehicleSubcategory> getVehicleSubcategory() {
        return vehicleSubcategory;
    }
    public void setVehicleSubcategory(Set<VehicleSubcategory> vehicleSubcategory) {
        this.vehicleSubcategory = vehicleSubcategory;
    }

    public String getVehicle_category_name() {
        return vehicle_category_name;
    }
    public void setVehicle_category_name(String vehicle_category_name) {
        this.vehicle_category_name = vehicle_category_name;
    }

    @Override
    public String toString() {
        return "VehicleCategory{" +
                "vehicle_category_id=" + vehicle_category_id +
                ", vehicle_category_name='" + vehicle_category_name +
                "vehicle_Subcategory_id=" +  vehicleSubcategory + '\'' +
                '}';
    }
}
