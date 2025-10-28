package com.java.SpringDataJpa.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.java.SpringDataJpa.Entity.Library;
import com.java.View.ResultView;

public interface ILibraryRepo extends JpaRepository<Library, Integer> 
{
		//FindBy--Property(FieldName)---Keyword
	
	public List<Library> findByboolPrice(Double cost);
	public List<Library> findByboolPriceIs(Double cost);
	public List<Library> findByboolPriceEquals(Double cost);
	public List<Library> findByboolPriceLessThanEqual(Double cost);
	public List<Library> findByboolPriceBetween(Double startCost,Double endCost);
	public List<Library> findBybookPublisher(String publish);
	public List<Library> findBybookName(String name);
	public List<Library> findBybookNameAndboolPrice(String name,Double cost);



		
}
