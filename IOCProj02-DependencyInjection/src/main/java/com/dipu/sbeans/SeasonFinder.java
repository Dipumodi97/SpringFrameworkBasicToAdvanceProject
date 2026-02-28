package com.dipu.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {

	@Autowired
	private LocalDate localDate;
	
	public SeasonFinder() {
		System.out.println("SeasonFinder:: 0-param Constructor");
	}
	
	public String findOutSeasonName(String user) {
		
		System.out.println("SeasonFinder.findOutSeasonName()");
		
		// get current month value
		int monthValue = localDate.getMonthValue();
		
		// show the season name
		if(monthValue>=3 && monthValue <=6) {
			return "Hot Summer wishes to :"+user;
		}else if(monthValue>=7 && monthValue<=10) {
			return "Drizzling Monsoon wishes :"+user;
		}else {
			return "cool Winter wishes to :"+user;
		}
		
	}
}
