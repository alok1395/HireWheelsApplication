package com.upgrad.hirewheels.vallidator;

import com.upgrad.hirewheels.dto.LoginDTO;
import com.upgrad.hirewheels.dto.UsersDTO;
import com.upgrad.hirewheels.exceptions.APIException;
import org.springframework.stereotype.Service;

import static jdk.nashorn.internal.objects.ArrayBufferView.length;

@Service
public class UsersVallidatorImpl implements UsersVallidator{
    @Override
    public void validateUsers(UsersDTO usersDTO) throws APIException {
        if(usersDTO.getFirstName() == null)
            throw new APIException("FirstName cannot be null or empty");

        if(length(usersDTO.getPassword()) <= 5)
            throw new APIException("Password cannot be null or less than 5 characters");

        if(usersDTO.getEmail() != null)
            throw new APIException("Mobile Number / Email already exists");

        if(length(usersDTO.getMobile_no()) <= 10)
            throw new APIException("Mobile Number cannot be null or empty and must be 10 digits");
    }

    @Override
    public void validateUserLogin(LoginDTO loginDTO) throws APIException {
        if (loginDTO.getEmail() == null || loginDTO.getEmail().length() <= 0) {
            throw new APIException("Invalid Email");
        }
        if(loginDTO.getPassword() == null || loginDTO.getPassword().length() <= 0   ) {
            throw new APIException("Invalid password");
        }
    }
}
