package com.vehical;

import java.util.Comparator;

public class SortwithBasedonYear implements Comparator<VehicalData>{

	@Override
	public int compare(VehicalData v1, VehicalData v2) {
		if(v1.getYear()==v2.getYear()) 
			return 0;
			
		else if(v1.getYear()>v2.getYear()) 
			return 1;
		
		else 
			return -1;
	}

}
