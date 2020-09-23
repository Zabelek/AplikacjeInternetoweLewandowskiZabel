package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserService {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	 
	@Autowired
	private UsersRepository repository;
	
	public void registerNewUserAccount(Users accountDto) {
	    Users user = new Users();
	    user.setName(accountDto.getName());
	    user.setLastName(accountDto.getLastName());
	    
	    user.setPassword(passwordEncoder.encode(accountDto.getPassword()));
	    
	    user.setEmail(accountDto.getEmail());
	    user.setRole(Integer.valueOf(1));
	    repository.save(user);
	}
}
