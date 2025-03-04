package com.vehical;

public interface IUser {
	String register(User u);
	boolean login(String lUserName, String lPassword);
}
