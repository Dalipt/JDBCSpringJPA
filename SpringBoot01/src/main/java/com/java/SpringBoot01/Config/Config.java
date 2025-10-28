package com.java.SpringBoot01.Config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Config 
{
	public Config()
	{
		System.out.println("Config class constructor");
	}
	@Bean
	public LocalTime createTime()
	{
		return LocalTime.now();
	}
}
