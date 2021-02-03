package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.UsersDao;
import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.exceptions.IncorrectPasswordException;
import com.upgrad.hirewheels.exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
@Service
public class UsersServiceImpl  implements UsersService{
    @Autowired
    UsersDao usersDao;



    public Users getUser() {

        Users users= new Users();
        return users;
    }

    @Override
    public Users getUsersDetailsByEmail(String email) {
        return null;
    }



    @Override
    public Users acceptUsersDetails(Users newUsers) {
        return null;
    }


}
