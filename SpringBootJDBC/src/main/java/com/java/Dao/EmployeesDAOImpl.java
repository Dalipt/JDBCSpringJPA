package com.java.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.java.Model.Employees;

@Component
public class EmployeesDAOImpl implements IEmployeeDAO {

	@Autowired
	private DataSource datasource;
	private String sql_query="select * from Employees";
	List<Employees> employees=null;
	
	@Override
	public List<Employees> getEmployeesInfo()
	{
		try
		{
			Connection connection=datasource.getConnection();
			PreparedStatement stmt=connection.prepareStatement(sql_query);
			ResultSet rs=stmt.executeQuery();
			employees= new ArrayList<>();
			while(rs.next())
			{
				Employees emp= new Employees();
//				Integer i=rs.getInt(1);
//				emp.setId(i);
//				
//				String ia=rs.getString(2);
//				emp.setName(ia);
//				
//				String ai=rs.getString(3);
//				emp.setCity(ai);
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setCity(rs.getString(3));
				
				employees.add(emp);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return employees;
	}

}
