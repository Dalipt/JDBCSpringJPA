package com.java.SpringBoot01.Services;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class TestingClass 
{
	static
	{
		System.out.println("Static block");
	}
	{
		System.out.println("Java Init block");
	}
	
	public TestingClass()
	{
		System.out.println("Constructor");
	}
	public void checkMessage() 
	{
		System.out.println("Generale message");
	}
	@PreDestroy
	public void destroy() 
	{
		System.out.println("Destroy message");
	}
}
