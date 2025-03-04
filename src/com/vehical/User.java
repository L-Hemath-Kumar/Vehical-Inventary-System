package com.vehical;

public class User {
	private String fname;
	private String lname;
	private String uName;
	private String pw;
	
	//Default Constructor
	public User() {
		super();
		
	}


	// Constructor with Arguments
	public User(String fname, String lname, String uname, String pw) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.uName = uname;
		this.pw = pw;
	}

	//Getter and Setters Method
	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getUname() {
		return uName;
	}


	public void setUname(String uname) {
		uName = uname;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}

	
	//to String Method
	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", Uname=" + uName + ", pw=" + pw + "]";
	}
	
	
	
	
	
	

}
