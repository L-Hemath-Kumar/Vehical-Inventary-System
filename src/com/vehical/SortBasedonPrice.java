package com.vehical;

import java.util.Comparator;

public class SortBasedonPrice implements Comparator<VehicalData>{

	@Override
	public int compare(VehicalData v1, VehicalData v2) {
		if(v1.getPrice()==v2.getPrice()) 
			return 0;
			
		else if(v1.getPrice()>v2.getPrice()) 
			return 1;
		
		else 
			return -1;
		
	}
	

}
