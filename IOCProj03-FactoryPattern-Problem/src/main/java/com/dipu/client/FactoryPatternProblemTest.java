package com.dipu.client;

import com.dipu.comps.AadharDetails;
import com.dipu.comps.Employee;
import com.dipu.comps.Person;
import com.dipu.comps.Student;
import com.dipu.factory.PersonFactory;

public class FactoryPatternProblemTest {

	public static void main(String[] args) {
		
		Person employee = PersonFactory.getInstance("emp");
		System.out.println(employee);
		
		System.out.println("------------------------------");
		
		Person student = PersonFactory.getInstance("stud");
		System.out.println(student);
		
		/*AadharDetails aadharDetails = new AadharDetails(3464565464L, 30, 999999L);// Dependent Class Object
		
		
		//  Target class object having dependent class object
		Person student = new Student("Simran", "Banglore", aadharDetails, 1001, "JAVA");
		System.out.println(student.toString());
		
		System.out.println("===========================");
		
		// Dependent class Object
		AadharDetails aadharDetails1 = new AadharDetails(3464565464L, 30, 999999L);
		// Target class object having dependent class object
		Person employee = new Employee("Dipu", "Mumbai", aadharDetails1, 1002, "Manager");
		System.out.println(employee.toString());*/
	}
}
