package com.dipu.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.dipu.sbeans.SeasonFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		// create IOC container
		
		FileSystemXmlApplicationContext context = 
				new FileSystemXmlApplicationContext(
						"src/main/java/com/dipu/configuration/applicationContext.xml");
		
		// get target spring bean class object reference
		Object object = context.getBean("sf");
		
		// type-casting 
		SeasonFinder finder = (SeasonFinder)object;
		
		// invoke the business method
		String result = finder.findOutSeasonName("raja");
		System.out.println(result);
		
		// close container
		context.close();
	}
}
