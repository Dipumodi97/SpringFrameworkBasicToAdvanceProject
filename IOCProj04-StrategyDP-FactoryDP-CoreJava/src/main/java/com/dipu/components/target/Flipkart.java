package com.dipu.components.target;

import java.util.Arrays;
import java.util.Random;

import com.dipu.components.Courier;

public final class Flipkart {

	// HAS-A Relation
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart:: 0-param Constructor");
	}
	
	// setter method for Injection(assigning dependent class object to target class object)
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}
	
	// business method 
	public String shopping(String[] items,Double[] prices) {
		
		// calculate bill amount
		Double total = 0.0;
		for (Double p : prices) {
			total = total+p;
		}
		
		// generate Random number as  the order Id
		// new Random() it's anonymous object creation
		int orderid = new Random().nextInt(10000);
		
		// use courier
		String msg = courier.deliver(orderid);
		//we want to convert entire Array is into Single String
		return Arrays.toString(items)+" are purchased having prices "
		+Arrays.toString(prices)
		+" , Bill Amount : "+total+" -----> "+msg;
	}
}
