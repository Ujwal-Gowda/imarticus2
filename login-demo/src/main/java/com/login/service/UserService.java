package com.login.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.model.User;
import com.login.repo.UserRepo;

@Service
public class UserService {
	
	
	@Autowired
	UserRepo userRepo;
	
	public void CreateUserLogin(String userName, String password) {
		
		User allUser = new User(userName, password);
		
		userRepo.save(allUser);
	}
	public String checkUserLogin(String userName, String password) {
		
		
		List<User>  allUsers=userRepo.findAll();
	
		for(User user:allUsers) {
			if(user.getUserName().equalsIgnoreCase(userName) && (user.getPassword().equalsIgnoreCase(password))) {
				
				return "true";
			}
		}

		return "false";

	}
}

