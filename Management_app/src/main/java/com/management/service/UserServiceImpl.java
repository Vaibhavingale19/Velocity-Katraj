package com.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.model.UserDetails;
import com.management.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	public UserDetails createUser(UserDetails user) {
		
		return userRepo.save(user);
	}

}
