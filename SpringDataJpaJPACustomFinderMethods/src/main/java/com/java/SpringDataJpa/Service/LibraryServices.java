package com.java.SpringDataJpa.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.SpringDataJpa.Entity.Library;
import com.java.SpringDataJpa.Repo.ILibraryRepo;
import com.java.View.ResultView;
@Service
public class LibraryServices implements ILibraryServices
{
	
	private ILibraryRepo repo;
	@Autowired
	public void setRepo(ILibraryRepo repo) {
		this.repo = repo;
	}
	@Override
	public List<Library> fetchByboolPrice(Double cost) {
	
		return repo.findByboolPrice(cost);
	}
	@Override
	public List<Library> findByboolPriceIs(Double cost) 
	{
		return repo.findByboolPriceIs(cost);
	}
	@Override
	public List<Library> findByboolPriceEquals(Double cost) {
		
		return repo.findByboolPriceEquals(cost);
	}
	@Override
	public List<Library> findByboolPriceLessThanEqual(Double cost) 
	{
		return repo.findByboolPriceLessThanEqual(cost);
	}
	@Override
	public List<Library> findByboolPriceBetween(Double startCost, Double endCost) {
		return repo.findByboolPriceBetween(startCost, endCost);
	}
	@Override
	public List<Library> findBybookPublisher(String publish) 
	{
		return repo.findBybookPublisher(publish);
	}
	@Override
	public List<Library> findBybookName(String name) 
	{
		return repo.findBybookName(name);
	}
	@Override
	public List<Library> findBybookNameAndboolPrice(String name, Double cost) {
		return repo.findBybookNameAndboolPrice(name, cost);
	}
	

}

