package com.techbee.springBootUserProfile;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class UserProfileDAO {
	
	ArrayList<UserProfile> javaSDETClass = new ArrayList<UserProfile>();
	
	UserProfileDAO(){
		UserProfile newStudent = new UserProfile();
		newStudent.setName("John");
		newStudent.setLastName("Doe");
		newStudent.setPhone(123456);
		
		javaSDETClass.add(newStudent);
	}
	
	//CRUD --> Create, Read, Update and Delete
	
	//Create User method
	public void addUser(UserProfile user) {
		javaSDETClass.add(user);
	}
	
	//Display All User
	public ArrayList<UserProfile> displayAllUser() {
		return javaSDETClass;
	}
	
	//display only one user
	public ArrayList<UserProfile> displayUser() {
		return javaSDETClass;
	}
	//Updating user
	
	//Delete User

}
