package com.java.SpringDataJpa.Service;

import java.util.Optional;

import com.java.SpringDataJpa.Entity.Library;

public interface ILibraryServices 
{
	public String registerBookInfo(Library library);
	public Iterable<Library> registerMultipleBookInfo(Iterable<Library> librarys);
	public Long LibraryBookCount();
	public boolean checkBookAvailability(Integer ID);
	public Iterable<Library> getAllLibraryBookInfo();
	public Iterable<Library> getAllLibraryBookInfo(Iterable<Integer>ids);
	public Optional<Library> getBooksBasedOnId(Integer id);
	public String removeBookById(Integer Id);
	public String removeBookById(Library Obj);
}
