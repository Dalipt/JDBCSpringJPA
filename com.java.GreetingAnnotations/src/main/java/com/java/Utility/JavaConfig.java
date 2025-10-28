package com.java.Utility;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="{com.java}")
public class JavaConfig
{
	public JavaConfig()
	{
		System.out.println("JavaConfig bean created");
	}
	@Bean
	public LocalDateTime createTimeObject()
	{
		return LocalDateTime.now();
	}
}
