package com.upgrad.hirewheels.vallidator;

import com.upgrad.hirewheels.dto.BookingDTO;
import com.upgrad.hirewheels.exceptions.APIException;

import java.text.ParseException;

public interface BookingVallidator {
    public void validateBooking(BookingDTO bookingDTO) throws ParseException, APIException;

}
