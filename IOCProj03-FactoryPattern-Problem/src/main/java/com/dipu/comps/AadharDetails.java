// AadharDetails.java (Dependent Class)

package com.dipu.comps;

public class AadharDetails {

	private Long aadharNo;
	private Integer age;
	private Long mobileNo;
	
	
	// alt+shift +s, o (To get parameterized constructor)
	public AadharDetails(Long aadharNo, Integer age, Long mobileNo) {
		System.out.println("AadharDetails.AadharDetails()");
		this.aadharNo = aadharNo;
		this.age = age;
		this.mobileNo = mobileNo;
	}
	// alt+shift +s, s (To get toString())
	@Override
	public String toString() {
		return "AadharDetails [aadharNo=" + aadharNo + ", age=" + age + ", mobileNo=" + mobileNo + "]";
	}
	
	
	
}
