package com.java.SpringDataJpa.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.SpringDataJpa.Entity.Testing;
@Repository
public interface ITesting extends CrudRepository<Testing, Integer> 
{
	
}
