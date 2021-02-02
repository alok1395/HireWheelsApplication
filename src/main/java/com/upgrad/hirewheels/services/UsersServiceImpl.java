package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.UsersDao;
import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.exceptions.IncorrectPasswordException;
import com.upgrad.hirewheels.exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;

public class UsersServiceImpl {
    @Autowired
    UsersDao usersDao;



    public Users getUser() {

        Users users= new Users();
        return users;
    }


}
