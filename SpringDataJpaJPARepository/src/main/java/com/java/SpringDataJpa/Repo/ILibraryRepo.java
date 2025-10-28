package com.java.SpringDataJpa.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.java.SpringDataJpa.Entity.Library;
import com.java.View.ResultView;

public interface ILibraryRepo extends JpaRepository<Library, Integer> 
{
		//findBy-propertyName(Enityclass)-Keyword available for JPARepository
	
		List<ResultView>findByCostLessThan(Double cost);
		
}
