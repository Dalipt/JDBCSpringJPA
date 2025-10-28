package com.java.SpringDataJpa.Repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.event.TransactionalEventListener;

import com.java.SpringDataJpa.Entity.Library;
import com.java.View.ResultView;

import jakarta.transaction.Transactional;

public interface ILibraryRepo extends JpaRepository<Library, Integer> 
{
		//Use of HQL like Hibernate
	@Query("FROM Library WHERE bookName=:name")
	public List<Library> searchBybookName(String name);		
	
	@Query("FROM Library WHERE bookName IN(:name1,:name2)")
	public List<Library> searchBybookName(String name1,String name2);	
	
	@Query("SELECT l.bookName, l.bookPublisher FROM Library l WHERE l.boolPrice BETWEEN :startRange AND :maxRange")
	List<String> searchByboolPrice(@Param("startRange") Double startRange, @Param("maxRange") Double maxRange);

	@Transactional
	@Modifying
	@Query("UPDATE Library l SET l.boolPrice = :boolPrice WHERE l.bookPublisher = :bookPublisher")
	int updateBoolPriceByBookPublisher(@Param("boolPrice") Double boolPrice, @Param("bookPublisher") String bookPublisher);

	@Transactional
	@Modifying
	@Query("DELETE FROM Library WHERE boolPrice = :bool_Price")
	int deleteBoolPriceByboolPrice(Double boolPrice);

	
	@Transactional
	@Modifying
	@Query(value="INSERT INTO Library(Id,book_Name,book_publisher,bool_Price) VALUES(?,?,?,?)", nativeQuery=true)
	int insertBookInfo(Integer Id,String book_Name,String book_publisher,Double bool_Price);
	
	@Query(value="SELECT NOW() FROM DUAL",nativeQuery=true)
	public Date getTheSystemDateAndTime();
}
