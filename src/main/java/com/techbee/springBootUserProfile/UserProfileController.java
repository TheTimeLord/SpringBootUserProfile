package com.techbee.springBootUserProfile;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProfileController {

	@Autowired
	UserProfileDAO javaSDETDAO = new UserProfileDAO();
	
	@GetMapping("/displayAllUsers")
	public ArrayList<UserProfile> displayAllUsers() {
		return javaSDETDAO.getAllUsers();
		
	}
	
	@GetMapping("/displayUser/{firstName}")
	public UserProfile displayUser(@PathVariable String firstName) {
		return javaSDETDAO.getUser(firstName);
	}
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody UserProfile newUser) {
		
		javaSDETDAO.addUser(newUser);
		return newUser.getFirstName() + " added successfully!";
		
	}
	
	//Implement Delete
	
	@PutMapping("updateUser/{oldName}")
	public String updateUser(@PathVariable String oldName, @RequestBody UserProfile updatedUser) {
		UserProfile oldUser = javaSDETDAO.getUser(oldName);
		String firstName = updatedUser.getFirstName();
		String lastName = updatedUser.getLastName();
		String email = updatedUser.getEmailAddress();
		if(oldUser != null) {
			javaSDETDAO.updateUser(oldUser, firstName, lastName, email);
			return "update success";
		}
		return "update failed";
	}
	
	@DeleteMapping("deleteUser/{name}")
	public String deleteUser(@PathVariable String name) {
		UserProfile user = javaSDETDAO.getUser(name);
		if(user != null) {
			javaSDETDAO.deleteUser(name);
			return "Delete Sucessful";
		}
		return "Delete Failed";
	}
}
