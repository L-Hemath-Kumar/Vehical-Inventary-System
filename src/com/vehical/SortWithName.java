package com.vehical;

import java.util.Comparator;

public class SortWithName implements Comparator<VehicalData>{

	@Override
	public int compare(VehicalData v1, VehicalData v2) {
		return v1.getBand().compareTo(v2.getBand());
	}

}
