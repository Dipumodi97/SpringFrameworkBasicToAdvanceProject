package com.dipu.components;

//public class DTDC implements Courier {

//According to Strategy Design Pattern using final keyword
public final class DTDC implements Courier {

	public DTDC() {
		System.out.println("DTDC:: 0-param constructor");
	}
	@Override
	public String deliver(int orderId) {
		
		return "order Id : "+orderId+" order is set for delivery using DTDC Courier Service";
	}

}
