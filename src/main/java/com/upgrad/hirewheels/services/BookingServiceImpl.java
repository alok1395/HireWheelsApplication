package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.BookingDao;
import com.upgrad.hirewheels.entities.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService{

    @Autowired
    BookingDao bookingDao;

    @Autowired
    UsersService usersService;

    @Override
    public Booking addBooking(Booking booking) {

        /*VehicleService.getAvailableVehicles(booking.getUser().getClass());
        usersService.getUser(booking.getUser().getBooking());
        bookingDao.save(booking);
        return booking;*/
        return null;
    }
}
