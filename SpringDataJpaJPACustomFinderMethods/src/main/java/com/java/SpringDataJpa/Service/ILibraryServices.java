package com.java.SpringDataJpa.Service;

import java.util.List;
import java.util.Optional;

import com.java.SpringDataJpa.Entity.Library;
import com.java.View.ResultView;

public interface ILibraryServices 
{

	public List<Library> fetchByboolPrice(Double cost);
	public List<Library> findByboolPriceIs(Double cost);
	public List<Library> findByboolPriceEquals(Double cost);
	public List<Library> findByboolPriceLessThanEqual(Double cost);
	public List<Library> findByboolPriceBetween(Double startCost,Double endCost);
	public List<Library> findBybookPublisher(String publish);
	public List<Library> findBybookName(String name);
	public List<Library> findBybookNameAndboolPrice(String name,Double cost);


}
