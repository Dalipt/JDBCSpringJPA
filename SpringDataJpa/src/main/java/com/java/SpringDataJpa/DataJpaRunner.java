package com.java.SpringDataJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.java.SpringDataJpa.Entity.Testing;
import com.java.SpringDataJpa.Repo.ITesting;
@Component
public class DataJpaRunner implements CommandLineRunner
{
	@Autowired
	private ITesting repo;
	@Override
	public void run(String... args) throws Exception
	{
		repo.save(new Testing(2,"Anil","Delhi"));
		
	}

}
