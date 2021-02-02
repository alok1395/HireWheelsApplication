package com.upgrad.hirewheels.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int location_id;

    @Column(length = 50, nullable = false)
    private String location_name;

    @Column(length = 100, nullable = false)
    private String address;

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

    @Column(length = 6, nullable = false)
    private int pincode;

    @OneToMany (mappedBy = "location", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private Set<Vehicle> vehicle;

    @OneToMany (mappedBy = "location", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private Set<Booking> booking;

    public Location(int location_id, String location_name, String address, int pincode, Object city) {
        
    }



    public int getLocation_id() {
        return location_id;
    }
    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public String getLocation_name() {
        return location_name;
    }
    public void setLocation_name(String location_name) {
        this.location_name = location_name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public Set<Vehicle> getVehicle() {
        return vehicle;
    }
    public void setVehicle(Set<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }

    public City getCity() {
        return city;
    }
    public void setCity(City city) {
        this.city = city;
    }

    public Set<Booking> getBooking() {
        return booking;
    }
    public void setBooking(Set<Booking> booking) {
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "Location{" +
                "location_id=" + location_id +
                ", location_name='" + location_name + '\'' +
                ", address='" + address + '\'' +
                ", city_id=" + city +
                ", pincode=" + pincode +
                ", Vehicle_id=" + vehicle +
                ", booking_id=" + booking +
                '}';
    }
}
