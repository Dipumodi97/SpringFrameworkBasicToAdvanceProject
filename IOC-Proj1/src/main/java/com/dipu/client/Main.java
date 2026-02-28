package com.dipu.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context  = new ClassPathXmlApplicationContext("IOC-Proj1\\src\\main\\resources\\applicationcontext.xml");
		context.getBean("");
	}
}
