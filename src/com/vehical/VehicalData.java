package com.vehical;

public class VehicalData {	
	private String brand;
	private int year;
	private double price;
		
	
	//Constructor
	public VehicalData(String brand, int year, double price) {
		super();
		this.brand = brand;
		this.year = year;
		this.price = price;
	}


	public String getBand() {
		return brand;
	}


	public void setBand(String band) {
		this.brand = band;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

//to String Method
	@Override
	public String toString() {
		return "manager [brand=" + brand + ", year=" + year + ", price=" + price + "]";
	}
	
	
	
}
