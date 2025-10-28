package com.java.SpringDataJpa.Service;

import java.util.Date;
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
	public List<Library> fetchBybookName(String name) {
		return repo.searchBybookName(name);
	}
	@Override
	public List<Library> fetchBybookName(String name1, String name2) {
		return repo.searchBybookName(name1, name2);
	}
	@Override
	public List<String> searchByboolPrice(Double startRange, Double maxRange) {
		// TODO Auto-generated method stub
		return repo.searchByboolPrice(startRange, maxRange);
	}
	@Override
	public int updateboolPriceBybookPublisher(Double newPrice, String bookPublisher) {
		return repo.updateBoolPriceByBookPublisher(newPrice, bookPublisher);
	}
	@Override
	public int deleteBoolPriceByboolPrice(Double boolPrice) {
		return repo.deleteBoolPriceByboolPrice(boolPrice);
	}
	@Override
	public int insertBookInfo(Integer Id,String book_Name, String book_publisher, Double bool_Price) {
		
		return repo.insertBookInfo(Id, book_Name, book_publisher, bool_Price);
				}
	@Override
	public Date fetchTheSystemDateAndTime() {
		return repo.getTheSystemDateAndTime();
	}

}
