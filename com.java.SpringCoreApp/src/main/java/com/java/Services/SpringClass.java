package com.java.Services;

public class SpringClass implements ICourse
{

	@Override
	public boolean getCourseDetails(double amount) {
		System.out.println("Course is selected and amount paid is:"+ amount);
		return true;
	}
	public SpringClass()
	{
		System.out.println("Constructor of SpringClass");
	}
}
