package com.java.Model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Employees
{
	private int id;
	private String name;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	public Employees(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public Employees() {
		// TODO Auto-generated constructor stub
	}
	
	

}
