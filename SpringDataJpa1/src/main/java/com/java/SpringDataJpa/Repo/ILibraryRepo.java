package com.java.SpringDataJpa.Repo;

import org.springframework.data.repository.CrudRepository;

import com.java.SpringDataJpa.Entity.Library;

public interface ILibraryRepo extends CrudRepository<Library, Integer> {

}
