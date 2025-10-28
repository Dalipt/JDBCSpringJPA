package com.java.SpringBoot01.Services;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Greeting implements Igreeting 
{
	@Autowired
	private LocalTime time;
	@Override
	public String generateGreeting(String msg)
	{
		int hour=time.getHour();
		if(hour<10)
		{
			System.out.println("GoodMorning"+msg);
		}
		if(hour<20)
		{
			System.out.println("GoodEvening"+ msg);
		}
		return msg;
	}

}
