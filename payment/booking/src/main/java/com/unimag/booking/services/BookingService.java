package com.unimag.booking.services;

import com.unimag.booking.dto.CreateBookingDto;
import com.unimag.booking.dto.ResponseBookingDto;

import jakarta.ws.rs.NotFoundException;

public interface BookingService {

    ResponseBookingDto createBooking(CreateBookingDto createBookingDto) throws NotFoundException;
    ResponseBookingDto getBookingById( String id) throws NotFoundException;
    ResponseBookingDto confirmedBooking(String bookingId); 

}
