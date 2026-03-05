package com.dipu.client;

import com.dipu.components.target.Flipkart;
import com.dipu.factory.FlipkartFactory;

public class StrategyDP_FactoryDPTest {

	public static void main(String[] args) {
		
		// use factory pattern class to get Flipkart class object having our choice dependent 
		// class object
		
		Flipkart flipkart = FlipkartFactory.getInstance("dtdc");
		
		// invoke business method
		String resultMsg = flipkart.shopping(
				new String[]{"Kurta-Pajama","Dandiya-Stick","Sweets","Maata-Chunari"}, 
				new Double[]{3000.0,100.0,800.99,200.0});
		
		System.out.println(resultMsg);
	}
}
