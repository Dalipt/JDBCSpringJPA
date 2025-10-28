package com.java.Main;

import com.java.Services.ICourse;

public class ClassSelecter
{
	 
	private ICourse course;

	public ClassSelecter()
	{
		//Constructor
	}
	public void setCourse(ICourse course) 
	{
		this.course=course;
	}

	public boolean getCourseDetails(double amount)
	{
		return course.getCourseDetails(amount);
	}
	

}
