package com.upgrad.hirewheels.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;

    @Column(length = 50, nullable = false)
    private String firstName;

    @Column(length = 50)
    private String lastName;

    @Column(length = 50, nullable = false)
    private String password;

    @Column(length = 50, nullable = false, unique = true)
    private String email;

    @Column(length = 10, nullable = false)
    private String mobile_no;

    @OneToMany (mappedBy = "user", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private Set<Booking> booking;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;


    private float wallet_money=10000.00f;



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

    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }

    public float getWallet_money() {
        return wallet_money;
    }
    public void setWallet_money(float wallet_money) {
        this.wallet_money = wallet_money;
    }

    public Set<Booking> getBooking() {
        return booking;
    }
    public void setBooking(Set<Booking> booking) {
        this.booking = booking;
    }



    @Override
    public String toString() {
        return "Users{" +
                "user_id=" + user_id +
                ", first_name='" + firstName + '\'' +
                ", last_name='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobile_no='" + mobile_no + '\'' +
                ", role_id=" + role +
                ", wallet_money=" + wallet_money +
                ", booking_id=" + booking +
                '}';
    }
}
