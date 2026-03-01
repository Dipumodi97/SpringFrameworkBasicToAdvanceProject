package com.dipu.comps;

public class Employee extends Person {

	private Integer empId;
	private String designation;
	
	public Employee(String name, String address, 
			AadharDetails aadharDetails,Integer empId,String designation) {
		super(name, address, aadharDetails);
		System.out.println("Employee:: 5-Param Constructor");
		this.empId = empId;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", designation=" + designation + "]"+super.toString();
	}
	

}
