package com.example.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.springboot.dto.UserRegistrationDto;
import com.example.springboot.entity.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
