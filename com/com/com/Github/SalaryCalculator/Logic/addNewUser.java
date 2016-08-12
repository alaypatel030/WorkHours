package com.com.Github.SalaryCalculator.Logic;

import java.io.Serializable;

public class addNewUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -999999999999999999L;

	private String userID;
	private String password;
	private String firstName;
	private String middleName;
	private String lastName;

	public addNewUser(String userID, String password, String firstName, String middleName, String lastName) {
		this.userID = userID;
		this.password = password;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;

	}

	public boolean equals(addNewUser other) {
		return (this == other) ? true : (this.userID.equals(other.userID));
	}
	
	public String getPassword() {
		return password;
	}

	public String getFristName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getUserID() {		
		return userID;
	}	
}
