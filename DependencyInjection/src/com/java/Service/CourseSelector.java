package com.java.Service;
//As as developer where all object injection(creation)done by spring framework
//Using dependency Injection with Spring framework by Constructor or setter
public class CourseSelector {

	public static void main(String[] args)
	{
		//Target class all class services used
		ClassSelecter sl= new ClassSelecter();//Constructor Injection
		//Injecting dependent object to target class is dependency injection
		sl.setCourse(new SpringClass());
		
		boolean status=sl.getCourseDetails(1223);
		if(status==true)
		{
			System.out.println("Course Enrolled Successfully");
		}
		else
		{
			System.out.println("Failed to enroll in course");
		}

	}

}
