package com.upgrad.hirewheels.controllers;

import com.upgrad.hirewheels.dto.BookingDTO;
import com.upgrad.hirewheels.entities.Booking;
import com.upgrad.hirewheels.services.BookingService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @Autowired
    BookingService bookingService;

    @Autowired
    ModelMapper modelMapper;

    @PostMapping(value= "/hirewheels/v1/vehicle", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity newBooking(@RequestBody BookingDTO movieDTO) {
        Booking newBooking = modelMapper.map(movieDTO, Booking.class);
        Booking savedBooking = bookingService.addBooking(newBooking);
        BookingDTO savedBookingDTO = modelMapper.map(savedBooking,BookingDTO.class);
        return new ResponseEntity<>(savedBookingDTO, HttpStatus.CREATED);
    }
}
