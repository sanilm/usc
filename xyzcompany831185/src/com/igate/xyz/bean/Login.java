package com.igate.xyz.bean;

import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;
public class Login {
	
	@NotEmpty(message="Username cannot be blank")
	@Size(min=4,max=8,message=" Username should be Minimum 4 and Maximum 8 characters") 
	private String userName;
	
	@NotEmpty(message="Username cannot be blank")
	@Size(min=4,max=8,message="Minimum 4 and Maximum 8 characters") 
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
