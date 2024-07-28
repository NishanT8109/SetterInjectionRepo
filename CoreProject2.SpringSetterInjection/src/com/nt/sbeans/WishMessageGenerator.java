//WishMessageGenerator.java(target class)
package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wmg") // To configure Java Class As Spring bean
public class WishMessageGenerator {
	//HAS -A property
	//@Autowired
	
	private LocalDateTime ldt;
	
	//@Autowired this throws an Exception becauz if we have an one @Autowired annotation then no need of giving more then one...
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator : 0-param Constructor");
		
		
	}
	@Autowired
	
	  public WishMessageGenerator(@Qualifier("ldt")LocalDateTime ldt) {
	  System.out.println("WishMessageGenerator.parameterized constructor");
	  this.ldt=ldt; System.out.println(ldt); }
	 
	//Business method
	public String generateWishMessage(String user) {
		
		System.out.println("WishMessageGenerator.generateWishMessage()");
		//Get current hour of the day
		int hour=ldt.getHour();
		//generated Wish message
		if(hour<12)
			return "Good Morning::"+user;
		else if(hour<16)
			return "Good AfterNoon::"+user;	
		else if(hour<20)
			return "Good Evening::"+user;
		else
			return "Good Night::"+user;
}	
}
