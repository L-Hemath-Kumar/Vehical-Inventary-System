package com.vehical;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TextClient {
	public static void show(List<VehicalData> vd) {
		for(VehicalData aa :vd) {
			System.out.println(aa.getBand()+" "+aa.getYear()+" "+aa.getPrice());
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Welcome to AUTOSHOP WORLD!!!");
		System.out.println("Please Register with Your Details");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first name");
		String fname = sc.nextLine();
		System.out.println("Please enter your second name");
		String lname = sc.nextLine();
		System.out.println("Please enter your username");
		String uname = sc.nextLine();
		System.out.println("Please enter your password");
		String pw = sc.nextLine();
		
		User user = new User(fname,lname,uname,pw);
		
		UserImplemention usi = new UserImplemention();
		String result = usi.register(user);
		System.out.println(result);
		//login input data
		System.out.println("Please Login with your Details ");
		System.out.println("Enter User name");
		String uname1 = sc.next();
		System.out.println("Enter password");
		String pass = sc.next();
		
		boolean result1 = usi.login(uname1, pass);
		// Object Creation of IManagerImplementation
		IManagerImplementation imm = new IManagerImplementation();
		//Data Entry
		VehicalData v1 = new VehicalData("Toyota",2019,5000);
		VehicalData v2 = new VehicalData("Suzuki",2016,3500);
		VehicalData v3 = new VehicalData("Benz",2021,6000);
		// Add data to VehicalData List
		imm.addVehical(v1);
		imm.addVehical(v2);
		imm.addVehical(v3);
		
		
		if(result1) {
			System.out.println("Sucessfully login");
			List<VehicalData> vd= imm.showVehical();
			show(vd);
			System.out.println("Enter Filter Based on brand(or)year(or)price:");
			
			String f = sc.next();
			if(f.equals("brand")) {
				Collections.sort(vd, new SortWithName());
				show(vd);
			}
			else if (f.equals("year")) {
				Collections.sort(vd, new SortBasedonPrice());
				show(vd);
			}
			else if (f.equals("price")) {
				Collections.sort(vd, new SortwithBasedonYear());
				for(VehicalData aa :vd) {
					System.out.println(aa.getBand()+" "+aa.getYear()+" "+aa.getPrice());
					}
			}
			
			
		}
		else {
			System.out.println("Please Enter Correct Details !!!");
		}
		
		
		
		
	}

}
