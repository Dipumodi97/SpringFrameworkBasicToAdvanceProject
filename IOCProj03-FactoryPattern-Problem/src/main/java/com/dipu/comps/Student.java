package com.dipu.comps;

public class Student extends Person {

	private Integer studentId;
	private String course;
	
	public Student(String name, String address, AadharDetails aadharDetails, Integer studentId, String course) {
		super(name, address, aadharDetails);
		System.out.println("Student:: 5-Param Constructor ");
		this.studentId = studentId;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", course=" + course + "]"+super.toString();
	}

}
