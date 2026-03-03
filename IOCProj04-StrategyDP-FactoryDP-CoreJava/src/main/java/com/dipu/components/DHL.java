package com.dipu.components;


//public class DHL implements Courier {

// According to Strategy Design Pattern using final keyword
public  final class DHL implements Courier {
	public DHL() {
		System.out.println("DHL:: 0-param constructor");
	}
	@Override
	public String deliver(int orderId) {
		
		return "order Id : "+orderId+" order is set for delivery using DHL Courier Service";
	}

}
