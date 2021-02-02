package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersDao extends JpaRepository {
    public Users findByUserFirstName(String firstName);
    public Users findByUserLastName(String lastName);
    public Users findByUserEmail(String email);
    public Users findByUserMobileNumber(String mobile_no);
    public Users save(Users users);
    public Users findById(int id);
    public Users update(Users users);
    public void delete(Users users);

}
