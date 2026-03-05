package com.dipu.factory;

import com.dipu.components.BlueDart;
import com.dipu.components.Courier;
import com.dipu.components.DHL;
import com.dipu.components.DTDC;
import com.dipu.components.target.Flipkart;

public class FlipkartFactory {

	//static factory method having logic  to create Flipkart object having the given courier object
	
	public static Flipkart getInstance(String courierType) {
		//  create Dependent class object
		Courier courier = null;
		
		if(courierType.equalsIgnoreCase("dtdc"))
			courier = new DTDC();
		else if(courierType.equalsIgnoreCase("bDart"))
			courier = new BlueDart();
		else if(courierType.equalsIgnoreCase("dhl"))
			courier = new DHL();
		else
			throw new IllegalArgumentException("Invalid Courier Type");
		
		// create Target class object
		
		Flipkart flipkart = new Flipkart();
		flipkart.setCourier(courier);
		
		return flipkart;
	}
}
