package com.java.Main;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.Services.CoreJavaClass;

public class LaunchApp {

	public static void main(String[] args) 
	{
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationConfig.xml");
		CoreJavaClass course=ctx.getBean(CoreJavaClass.class);
		
		boolean status=course.getCourseDetails(3232);
		
		if(status==true)
		{
			System.out.println("Course Puchased Successfully");
		}
		else
		{
			System.out.println("Failed to select course");
		}
	}

}
