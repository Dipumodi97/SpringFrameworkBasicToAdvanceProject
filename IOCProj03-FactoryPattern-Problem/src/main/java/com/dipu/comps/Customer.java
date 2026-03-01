package com.dipu.comps;

public class Customer extends Person {

	private Double billAmount;
	private String taxId;
	
	public Customer(String name, String address, AadharDetails aadharDetails, Double billAmount, String taxId) {
		super(name, address, aadharDetails);
		System.out.println("Customer:: 5-Param Constructor");
		this.billAmount = billAmount;
		this.taxId = taxId;
	}

	@Override
	public String toString() {
		return "Customer [billAmount=" + billAmount + ", taxId=" + taxId + "]"+super.toString();
	}
	
}
