package com.java.Main;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.Services.Greeting;

public class LaunchApp {

	public static void main(String[] args) 
	{
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationConfig.xml");
		Greeting greet=ctx.getBean(Greeting.class);
		System.out.println(greet.generateGreeting("Dalip"));
	}

}
