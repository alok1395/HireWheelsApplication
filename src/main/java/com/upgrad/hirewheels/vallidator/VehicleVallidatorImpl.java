package com.upgrad.hirewheels.vallidator;

import com.upgrad.hirewheels.dto.BookingDTO;
import com.upgrad.hirewheels.dto.VehicleDTO;
import com.upgrad.hirewheels.exceptions.APIException;
import com.upgrad.hirewheels.utils.DateDifference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.time.LocalDateTime;


@Service
public class VehicleVallidatorImpl implements  VehicleVallidator {

    @Autowired
    BookingDTO bookingDTO;

    @Override
    public void validateVehicle(VehicleDTO vehicleDTO) throws ParseException, APIException {

        int dateDifference = DateDifference.differenceBetweenDates(bookingDTO.getPickup_date(), LocalDateTime.now());
        if(dateDifference < 0 || dateDifference >= 3)
            throw new APIException("Booking date should be today's date");

        int dateDifference2 = DateDifference.differenceBetweenDates(bookingDTO.getDropoff_date(), LocalDateTime.now());
        if(dateDifference2 < 0 || dateDifference2 >= 3)
            throw new APIException("Booking date should be today's date");
    }
}
