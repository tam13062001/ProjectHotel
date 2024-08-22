package com.project.HotelManagerment.service.interfac;

import com.project.HotelManagerment.dto.Response;
import com.project.HotelManagerment.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}