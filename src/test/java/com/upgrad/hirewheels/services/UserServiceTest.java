package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.exceptions.UserNotFoundException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    UsersService usersService;

    @Test
    public void createUser() throws UserNotFoundException{

    }

    @Test
    public void getUser() throws UserNotFoundException{

    }
}
