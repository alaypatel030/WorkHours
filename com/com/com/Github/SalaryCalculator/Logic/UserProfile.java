package com.com.Github.SalaryCalculator.Logic;

import java.io.Serializable;

public class UserProfile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 999999999999999999L;

	public static final int ADMIN = 0;
	public static final int USER = 1;

	private String userID;
	private String password;
	private int premLevel;
	private String firstName;
	private String middleName;
	private String lastName;

	public UserProfile(String userID, String password, String firstName, String middleName, String lastName,
			int premLevel) {
		this.userID = userID;
		this.password = password;
		this.premLevel = premLevel;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;

	}

	public UserProfile(addNewUser newUser, int permLevel) {
		this.userID = newUser.getUserID();
	}

	public void setPermLevel(int newLevel) {
		if (!(newLevel < ADMIN || newLevel > USER))
			this.premLevel = newLevel;
	}
	
	public String getUserID(){
		return userID;
	}
	
	public String getFirstName(){
		return firstName;
	}
	public String getMiddleName(){
		return middleName;
	}
	public String getLastName(){
		return lastName;
	}
	
	public void setFirstName(String newName){
		this.firstName = newName;
	}
	
	public void setMiddleName(String newName){
		this.middleName = newName;
	}
	
	public void setLastName(String newName){
		this.lastName = newName;
	}
	
	
}

