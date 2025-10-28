package com.java.Services;

public class CoreJavaClass implements ICourse
{

	@Override
	public boolean getCourseDetails(double amount)
	{
		System.out.println("Course is taken JavaTraining and amount paid is:"+ amount);
		return true;
	}
	
	public CoreJavaClass()
	{
		System.out.println("Constructor of COreJavaClass");
	}

}
