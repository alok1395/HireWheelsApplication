package com.upgrad.hirewheels.entities;


import javax.persistence.*;
import java.util.Set;

@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int city_id;

    @Column(length = 50, nullable = false)
    private String city_name;

    @OneToMany (mappedBy = "city", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private Set<Location> location;

    public City(int city_id, String city_name) {
    }

    public int getCity_id() {
        return city_id;
    }
    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }
    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public Set<Location> getLocation() {
        return location;
    }
    public void setLocation(Set<Location> location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "City{" +
                "city_id=" + city_id +
                ", city_name='" + city_name +
                ", location_id" + location + '\'' +
                '}';
    }
}
