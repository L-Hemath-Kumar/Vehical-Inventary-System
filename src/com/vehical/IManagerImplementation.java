package com.vehical;

import java.util.ArrayList;

import java.util.List;

public class IManagerImplementation implements IManager{
	ArrayList<VehicalData> carAb ;
	//String re;
	
	
	
	public IManagerImplementation() {
		super();
		this.carAb = new ArrayList<>();
	}

	@Override
	public void addVehical(VehicalData vd) {
		carAb.add(vd);
		}

	@Override
	public List<VehicalData> showVehical() {
		
		/*Iterator<VehicalData> it = carAb.iterator();
		while(it.hasNext()) {
			VehicalData vd = it.next();
		System.out.println(vd.getBand()+" "+vd.getYear()+" "+vd.getPrice());
			//System.out.println(re);
		}*/
		return carAb;
		
	}

}
