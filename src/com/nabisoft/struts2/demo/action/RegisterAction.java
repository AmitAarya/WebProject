package com.nabisoft.struts2.demo.action;

import java.sql.Connection;
import java.sql.DriverManager;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
	private String name,password,email,gender;  
	   
	    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}	
	    public String execute() throws Exception {    	
	    	 int i=RegisterDao.save(this); 	    	    
	    	 if(i>0){  
	    		    return "success";  
	    		    }  
	    		    return "error";  
	    		}  
	   	   
}
