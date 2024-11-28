package com.example.demo.services.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.SignupRequest;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.enums.UserRole;
import com.example.demo.repository.UserRespository;

import lombok.RequiredArgsConstructor;

import org.springframework.security.crypto.password.PasswordEncoder;
@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{
	@Autowired
	private  UserRespository userReepository;
	@Autowired
    private PasswordEncoder passwordEncoder;
	@Override
	public UserDto createCustomer(SignupRequest signupRequest) {
		User user=new User();
		user.setNom(signupRequest.getNom());
		user.setPrenom(signupRequest.getPrenom());
		user.setEmail(signupRequest.getEmail());
		user.setPassword(passwordEncoder.encode(signupRequest.getPassword()));
		user.setUserRole(UserRole.CUSTOMER);
		user.setAdresse(signupRequest.getAdresse());
		user.setNumero_tel(signupRequest.getNumero_tel());
		User creerUser = userReepository.save(user);
		UserDto userDto=new UserDto();
		userDto.setId(creerUser.getId());
		return userDto;
	}

	@Override
	public boolean hasCustomerWithEmail(String email) {
		
		return userReepository.findFirstByEmail(email).isPresent();
	}

	@Override
	public UserDto loginCustomer(LoginRequest loginRequest) {
		User user = userReepository.findFirstByEmail(loginRequest.getEmail())
	            .orElseThrow(() -> new IllegalArgumentException("Invalid email or password"));

	        if (!passwordEncoder.matches(loginRequest.getPassword(), user.getPassword())) {
	            throw new IllegalArgumentException("Invalid email or password");
	        }

	        UserDto userDto = new UserDto();
	        userDto.setId(user.getId());
	        userDto.setEmail(user.getEmail());
	        userDto.setNom(user.getNom());
	        userDto.setPrenom(user.getPrenom());
	        userDto.setUserRole(user.getUserRole());
	        userDto.setNumero_tel(user.getNumero_tel());
	        userDto.setAdresse(user.getAdresse());
	        return userDto;
	}
	
	
	
}

