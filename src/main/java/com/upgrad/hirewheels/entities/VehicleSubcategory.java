package com.upgrad.hirewheels.entities;

import javax.persistence.*;
import java.util.Set;


@Entity
public class VehicleSubcategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicle_subcategory_id;

    @Column(length = 50, nullable = false,unique = true)
    private String vehicle_subcategory_name;

    @Column(nullable = false)
    private float price_per_day;

    @ManyToOne
    @JoinColumn(name = "vehicle_category_id", nullable = false)
    private VehicleCategory vehicleCategory;

    @OneToMany (mappedBy = "vehicleSubcategory", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private Set<Vehicle> vehicle;



    public Set<Vehicle> getVehicle() {
        return vehicle;
    }
    public void setVehicle(Set<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }

    public int getVehicle_subcategory_id() {
        return vehicle_subcategory_id;
    }
    public void setVehicle_subcategory_id(int vehicle_subcategory_id) {
        this.vehicle_subcategory_id = vehicle_subcategory_id;
    }

    public String getVehicle_subcategory_name() {
        return vehicle_subcategory_name;
    }
    public void setVehicle_subcategory_name(String vehicle_subcategory_name) {
        this.vehicle_subcategory_name = vehicle_subcategory_name;
    }

    public float getPrice_per_day() {
        return price_per_day;
    }
    public void setPrice_per_day(float price_per_day) {
        this.price_per_day = price_per_day;
    }

    public VehicleCategory getVehicleCategory() {
        return vehicleCategory;
    }
    public void setVehicleCategory(VehicleCategory vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }


    @Override
    public String toString() {
        return "Vehicle_subcategory{" +
                "vehicle_subcategory_id=" + vehicle_subcategory_id +
                ", vehicle_subcategory_name='" + vehicle_subcategory_name + '\'' +
                ", price_per_day=" + price_per_day +
                ", vehicleCategory=" + vehicleCategory+
                ", Vehicle_id=" + vehicle +
                '}';
    }
}
