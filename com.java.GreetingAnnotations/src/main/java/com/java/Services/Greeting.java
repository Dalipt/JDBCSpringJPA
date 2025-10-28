package com.java.Services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class Greeting
{
	@Autowired
	private LocalDateTime time;
	public Greeting()
	{
		System.out.println("Service Bean created");
	}
	public String generateGreeting(String name)
	{
		int hour=time.getHour();
		if(hour<12)
			return "GoodMorning !"+ name;
		else if(hour<16)
			return "GoodAfternoon"+ name;
		else if(hour<12)
			return"Good Evening"+name;
		else
		{
			return"GoodNight!"+name;
		}
	}

}
