package com.java.SpringDataJpa.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.java.SpringDataJpa.Entity.Library;
import com.java.View.ResultView;

public interface ILibraryServices 
{
	public List<Library> fetchBybookName(String name);	
	public List<Library> fetchBybookName(String name1,String name2);		
	List<String> searchByboolPrice(@Param("startRange") Double startRange, @Param("maxRange") Double maxRange);
	public int  updateboolPriceBybookPublisher(Double newPrice,String bookPublisher);
	int deleteBoolPriceByboolPrice(Double boolPrice);
	int insertBookInfo(Integer Id,String book_Name,String book_publisher,Double bool_Price);
	public Date fetchTheSystemDateAndTime();

}
