package com.dipu.components;


//According to Strategy Design Pattern using final keyword
public final class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("Bluedart:: 0-param constructor");
	}
	@Override
	public String deliver(int orderId) {
		
		return "order Id : "+orderId+" order is set for delivery using BlueDart Courier Service";
	}

}
