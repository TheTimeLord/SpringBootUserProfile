package com.techbee.springBootUserProfile;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProfileController {

	@Autowired
	UserProfileDAO javaSDETDAO = new UserProfileDAO();
	
	@GetMapping("/displayAllUsers")
	public ArrayList<UserProfile> displayAllUsers() {
		return javaSDETDAO.displayAllUser();
		
	}
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody UserProfile newUser) {
		
		javaSDETDAO.addUser(newUser);
		return newUser.getName() + " added successfully!";
		
	}
	
	//Implement Delete
	
	//Implement search user by name
	
	//Implement update
}
