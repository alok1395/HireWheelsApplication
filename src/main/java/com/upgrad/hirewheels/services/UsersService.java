package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Users;

public interface UsersService {
    public Users getUser();

    Users getUsersDetailsByEmail(String email);

    Users acceptUsersDetails(Users newUsers);
}
