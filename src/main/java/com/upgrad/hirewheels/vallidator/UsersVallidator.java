package com.upgrad.hirewheels.vallidator;

import com.upgrad.hirewheels.dto.LoginDTO;
import com.upgrad.hirewheels.dto.UsersDTO;
import com.upgrad.hirewheels.exceptions.APIException;

public interface UsersVallidator {
    void validateUsers(UsersDTO usersDTO) throws APIException;;
    public void validateUserLogin(LoginDTO loginDTO) throws APIException;
}
