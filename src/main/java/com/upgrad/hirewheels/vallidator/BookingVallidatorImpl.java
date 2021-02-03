package com.upgrad.hirewheels.vallidator;

import com.upgrad.hirewheels.dto.BookingDTO;
import com.upgrad.hirewheels.exceptions.APIException;
import com.upgrad.hirewheels.utils.DateDifference;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.time.LocalDateTime;

@Service
public class BookingVallidatorImpl implements BookingVallidator{
    @Override
    public void validateBooking(BookingDTO bookingDTO) throws ParseException, APIException {
        if(bookingDTO.getBooking_id() <= 0)
            throw new APIException("Invalid userId");

        if(bookingDTO.getAmount() <= 0)
            throw new APIException("Insufficient balance. Please check with Admin");
        int dateDifference = DateDifference.differenceBetweenDates(bookingDTO.getBooking_date(), LocalDateTime.now());
        if(dateDifference < 0 || dateDifference >= 3)
            throw new APIException("Booking date should be today's date");
    }
}
