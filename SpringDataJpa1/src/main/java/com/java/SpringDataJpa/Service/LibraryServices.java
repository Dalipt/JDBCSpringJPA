package com.java.SpringDataJpa.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.SpringDataJpa.Entity.Library;
import com.java.SpringDataJpa.Repo.ILibraryRepo;
@Service
public class LibraryServices implements ILibraryServices
{
	
	private ILibraryRepo repo;
	@Autowired
	public void setRepo(ILibraryRepo repo) {
		this.repo = repo;
	}

	@Override
	public String registerBookInfo(Library library)
	{
		Library lib=repo.save(library);
		return "Librarybook info added with id "+lib.getId();
	}

	@Override
	public Iterable<Library> registerMultipleBookInfo(Iterable<Library> librarys) {
		
		return repo.saveAll(librarys);
	}

	@Override
	public Long LibraryBookCount() {
		return repo.count();
	}

	@Override
	public boolean checkBookAvailability(Integer ID) {
		return repo.existsById(ID);
	}

	@Override
	public Iterable<Library> getAllLibraryBookInfo() {
		return repo.findAll();
	}

	@Override
	public Iterable<Library> getAllLibraryBookInfo(Iterable<Integer> ids)
	{
		return repo.findAllById(ids);
	}

	@Override
	public Optional<Library> getBooksBasedOnId(Integer id)
	{
		return repo.findById(id);
	}

	@Override
	public String removeBookById(Integer Id) 
	{
		/*
		 * Optional<Library> opt= repo.findById(Id); if(opt.isPresent()) {
		 * repo.deleteById(Id); return "record with"+Id+"deleted"; } else return
		 * "record with"+Id+"Not Available";
		 */
		Boolean es=repo.existsById(Id);
		if(es)
		{
			repo.deleteById(Id);
			return "record with Id"+Id+"Deleted successfully";
		}
		else 
		{
			return"record with Id"+Id+"Not Available";
		}
		
		
	}

	@Override
	public String removeBookById(Library Obj) 
	{
		 Integer Id=Obj.getId();
		 Optional<Library> opt= repo.findById(Id);
		 if(opt.isPresent()) 
		 {
		repo.deleteById(Id); return "record with"+Id+"deleted";
		} 
		 else return"record with"+Id+"Not Available";
	}
	

}

