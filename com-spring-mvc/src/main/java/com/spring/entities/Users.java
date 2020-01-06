package com.spring.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {

	@Id
	@GeneratedValue
	private int userId;
	
	@Column(name="user_password")
	private String userPassword;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_number")
	private int userNumber;
	
	private Set<Book> book;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userPassword=" + userPassword + ", userName=" + userName + ", userNumber="
				+ userNumber + "]";
	}
	
	
	
	
}
