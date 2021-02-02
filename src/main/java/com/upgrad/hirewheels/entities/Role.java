package com.upgrad.hirewheels.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int role_id;

    @Column(length = 50, nullable = false, unique = true)
    private String role_name;

    @OneToMany (mappedBy = "role", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private Set<Users> user;

    public int getRole_id() {
        return role_id;
    }
    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }
    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public Set<Users> getUser() {
        return user;
    }
    public void setUser(Set<Users> user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Role{" +
                "role_id=" + role_id +
                ", role_name='" + role_name +
                "user_id="+ user + '\'' +
                '}';
    }
}
