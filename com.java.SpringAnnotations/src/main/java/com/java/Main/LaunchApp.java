package com.java.Main;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp {

	public static void main(String[] args) 
	{
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationConfig.xml");
		
	}

}
