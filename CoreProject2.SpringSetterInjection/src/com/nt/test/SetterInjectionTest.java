package com.nt.test;
//import com.nt.sbeans.WishMessageGenerator;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.nt.sbeans.WishMessageGenerator;
 
public class SetterInjectionTest{
	public static void main(String[]args)
	{
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
			Object obj=ctx.getBean("wmg");
	
	WishMessageGenerator generator=(WishMessageGenerator)obj;
	//Invoke the bussiness method
	String result=generator.generateWishMessage("Nishant");
	System.out.println(result);
	ctx.close();
}
}

 