package com.upgrad.hirewheels.dto;

import com.upgrad.hirewheels.entities.Booking;
import com.upgrad.hirewheels.entities.Role;

import javax.persistence.*;
import java.util.Set;

public class UsersDTO {
        int user_id;
        String firstName;
        String lastName;
        String password;
        String email;
        String mobile_no;
        int booking_id;
        int role_id;
        float wallet_money=10000.00f;

    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile_no() {
        return mobile_no;
    }
    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public int getBooking_id() {
        return booking_id;
    }
    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public int getRole_id() {
        return role_id;
    }
    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public float getWallet_money() {
        return wallet_money;
    }
    public void setWallet_money(float wallet_money) {
        this.wallet_money = wallet_money;
    }
}
