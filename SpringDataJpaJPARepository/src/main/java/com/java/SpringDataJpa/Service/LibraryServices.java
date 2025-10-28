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
	public List<ResultView> fetchByCost(Double cost) {
		return repo.findByCostLessThan(cost);
	}

}

