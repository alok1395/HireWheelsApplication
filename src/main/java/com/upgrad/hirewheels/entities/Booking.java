package com.upgrad.hirewheels.entities;



import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int booking_id;

    @Column(nullable = false)
    private LocalDateTime  pickup_date ;

    @Column(nullable = false)
    private LocalDateTime dropoff_date;

    @Column(nullable = false)
    private LocalDateTime  booking_date ;

    @Column(nullable = false)
    private float amount;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    public int getBooking_id() {
        return booking_id;
    }
    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public LocalDateTime getPickup_date() {
        return pickup_date;
    }
    public void setPickup_date(LocalDateTime pickup_date) {
        this.pickup_date = pickup_date;
    }

    public LocalDateTime getDropoff_date() {
        return dropoff_date;
    }
    public void setDropoff_date(LocalDateTime dropoff_date) {
        this.dropoff_date = dropoff_date;
    }

    public LocalDateTime getBooking_date() {
        return booking_date;
    }
    public void setBooking_date(LocalDateTime booking_date) {
        this.booking_date = booking_date;
    }

    public float getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Users getUser() {
        return user;
    }
    public void setUser(Users user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "booking_id=" + booking_id +
                ", pickup_date=" + pickup_date +
                ", dropoff_date=" + dropoff_date +
                ", booking_date=" + booking_date +
                ", amount=" + amount +
                ", location_id=" + location +
                ", vehicle_id=" + vehicle +
                ", user_id=" + user +
                '}';
    }
}
