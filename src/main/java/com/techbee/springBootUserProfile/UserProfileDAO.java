package com.techbee.springBootUserProfile;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class UserProfileDAO {
	
	ArrayList<UserProfile> javaSDETClass = new ArrayList<UserProfile>();
	
	UserProfileDAO(){
		UserProfile newStudent = new UserProfile();
		newStudent.setFirstName("John");
		newStudent.setLastName("Doe");
		newStudent.setEmailAddress("soldier@aol.com");
		
		javaSDETClass.add(newStudent);
	}
	
	//CRUD --> Create, Read, Update and Delete
	
	// Create User method
	public void addUser(UserProfile user) {
		javaSDETClass.add(user);
	}
	
	// Display All User
	public ArrayList<UserProfile> getAllUsers() {
		return javaSDETClass;
	}
	
	// Display only one user
	// NOTE: Currently only returns the first instance of User with firstname
	public UserProfile getUser(String firstName) {
		for(UserProfile user : javaSDETClass) {
			if(user.getFirstName().equals(firstName))
				return user;
		}
		return null;
	}
	
	// Updating user
	public void updateUser(UserProfile user, String firstName, String lastName, String email) {
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmailAddress(email);
	}
	
	
	// Delete User

}
