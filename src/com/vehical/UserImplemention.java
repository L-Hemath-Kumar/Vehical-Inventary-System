package com.vehical;

import java.util.ArrayList;

public class UserImplemention implements IUser{
	ArrayList<User> uData;
	

	public UserImplemention() {
		super();
		this.uData = new ArrayList<>();
	}

	@Override
	public String register(User u) {
		System.out.println("Your Enterd Details is : "+u);
		uData.add(u);
		return "Thank you Your Successfully Registerd !!!";
	}

	@Override
	public boolean login(String lUserName, String lPassword) {
		System.out.println("User Name : "+lUserName+" PassWord : "+lPassword);
		for(User pD: uData) {
			if(pD!=null) {
				if((pD.getUname().equals(lUserName))&&(pD.getPw().equals(lPassword))){
					return true;
				
				}

			}
			
		}
		return false;
		
	}//login end

}
