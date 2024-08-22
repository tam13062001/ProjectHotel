package com.project.HotelManagerment.service.interfac;

import com.project.HotelManagerment.dto.LoginRequest;
import com.project.HotelManagerment.dto.Response;
import com.project.HotelManagerment.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
