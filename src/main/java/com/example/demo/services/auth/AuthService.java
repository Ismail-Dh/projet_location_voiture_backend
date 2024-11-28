package com.example.demo.services.auth;

import org.springframework.stereotype.Service;

import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.SignupRequest;
import com.example.demo.dto.UserDto;
@Service
public interface AuthService {

	 UserDto createCustomer(SignupRequest signupRequest);
	 
	 boolean hasCustomerWithEmail(String email);
	 
	 UserDto loginCustomer(LoginRequest loginRequest);
}

