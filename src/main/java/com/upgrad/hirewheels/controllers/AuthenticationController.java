package com.upgrad.hirewheels.controllers;

import com.upgrad.hirewheels.dto.LoginDTO;
import com.upgrad.hirewheels.dto.UsersDTO;
import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.exceptions.APIException;
import com.upgrad.hirewheels.exceptions.CustomException;
import com.upgrad.hirewheels.exceptions.UserNotFoundException;
import com.upgrad.hirewheels.exceptions.UsersEmailExistsException;
import com.upgrad.hirewheels.services.UsersServiceImpl;
import com.upgrad.hirewheels.vallidator.UsersVallidator;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value="//hirewheels/v1")
public class AuthenticationController {


    @Autowired
    ModelMapper modelMapper;

    @Autowired
    UsersServiceImpl usersService;
    @Autowired
    UsersVallidator usersValidator;

    @PostMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity signup(@RequestBody UsersDTO usersDTO)
            throws APIException, UsersEmailExistsException, CustomException, UserNotFoundException {

        usersValidator.validateUsers(usersDTO);
        Users users = usersService.getUsersDetailsByEmail(usersDTO.getEmail());
        if (users != null) {
            throw new UsersEmailExistsException(
                    "Users username already exists for : " + usersDTO.getEmail());
        }
        try {
            Map<String, String> model = new HashMap<>();
            String email = usersDTO.getEmail();
            String password = usersDTO.getPassword();
            if (StringUtils.isEmpty(email) || StringUtils.isEmpty(password)) {
                model.put("Error", "Username is invalid/ Password is empty");
                return new ResponseEntity<>(model, HttpStatus.BAD_REQUEST);
            }
            Users newUsers = modelMapper.map(usersDTO, Users.class);
            Users savedUsers = usersService.acceptUsersDetails(newUsers);
            UsersDTO savedUsersDTO = modelMapper.map(savedUsers, UsersDTO.class);
            return new ResponseEntity<>(savedUsersDTO, HttpStatus.CREATED);
        } catch (Exception e) {
            throw new CustomException("Username " + usersDTO.getEmail() + " already registered",
                    HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    @PostMapping(value = "/users/login")
    public ResponseEntity login(@RequestBody LoginDTO loginDTO)
            throws APIException, UserNotFoundException, BadCredentialsException, CustomException {
        usersValidator.validateUserLogin(loginDTO);
        Map<String, String> model = new HashMap<>();
        String email = loginDTO.getEmail();
        String password = loginDTO.getPassword();
        if (StringUtils.isEmpty(email) || StringUtils.isEmpty(password)) {
            model.put("Error", "Email is invalid/ Password is empty");
            return new ResponseEntity<>(model, HttpStatus.BAD_REQUEST);
        }
        Users savedUsers = usersService.getUsersDetailsByEmail(email);
        if (!savedUsers.getPassword().equals(password)) {
            throw new BadCredentialsException("Invalid email/password");
        }
        model.put("message","Logged in Successfully");
        model.put("token",savedUsers.getEmail());
        return new ResponseEntity<>(model, HttpStatus.OK);
    }
}