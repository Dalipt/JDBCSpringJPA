package com.java.SpringDataJpa.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Library
{
	@jakarta.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;
	
	private String bookName;
	private String bookPublisher;
	
	private Double boolPrice;

	public Library(String bookName, String bookPublisher, Double boolPrice) {
		super();
		this.bookName = bookName;
		this.bookPublisher = bookPublisher;
		this.boolPrice = boolPrice;
	}

	@Override
	public String toString() {
		return "Library [Id=" + Id + ", bookName=" + bookName + ", bookPublisher=" + bookPublisher + ", boolPrice="
				+ boolPrice + "]";
	}

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public Double getBoolPrice() {
		return boolPrice;
	}

	public void setBoolPrice(Double boolPrice) {
		this.boolPrice = boolPrice;
	}
	
}
