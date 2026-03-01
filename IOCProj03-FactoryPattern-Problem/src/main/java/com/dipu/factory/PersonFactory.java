package com.dipu.factory;

import com.dipu.comps.AadharDetails;
import com.dipu.comps.Customer;
import com.dipu.comps.Employee;
import com.dipu.comps.Person;
import com.dipu.comps.Student;

public class PersonFactory {
	/**
	 *  public static factory method creating and returning 
	 *  One of Person(Abstract Class) of sub class object
	 *  
	 *  This method contain Factory Pattern Logic
	 */	
	public static Person getInstance(String personType) {
		
		// 
		Person person = null;
		if(personType.equalsIgnoreCase("emp")) {
			AadharDetails details = new AadharDetails(6547893L, 40, 6548416L);
			person = new Employee("Dipu", "Mumbai", details, 101, "Software Developer");
		}
		else if(personType.equalsIgnoreCase("cust")) {
			AadharDetails details1 = new AadharDetails(654785156L, 30, 5428416L);
			person = new Customer("Simran", "Banglore", details1, 10265.0, "65764566gad5");
		}
		else if(personType.equalsIgnoreCase("stud")) {
			AadharDetails details2 = new AadharDetails(6321453L, 25, 6784216L);
			person = new Student("Shyamli", "HYD", details2, 6546, "Python");
		}else {
			throw new IllegalArgumentException("Invalid PersonType");
		}
		return person;
	}
	
}
