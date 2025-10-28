package com.java.SpringDataJpa.Service;

import java.util.List;
import java.util.Optional;

import com.java.SpringDataJpa.Entity.Library;
import com.java.View.ResultView;

public interface ILibraryServices 
{
public List<ResultView> fetchByCost(Double cost);
}
