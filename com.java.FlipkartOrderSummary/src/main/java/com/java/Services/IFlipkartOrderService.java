package com.java.Services;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.java.order.Entity.OrderSummary;

public interface IFlipkartOrderService 
{
	public String addProductInfo(OrderSummary summary);
	public Iterable<OrderSummary> registerMultipleProductInfo(Iterable<OrderSummary> summary);
	public List<OrderSummary> findByorderId(Integer Id);
	public List<OrderSummary> findByitemCode(String Code);
	public List<OrderSummary> findByitemName(String name);
	public List<OrderSummary> findByitemPrice(Double price);
	public List<OrderSummary> findByitemCount(Float count);
	public List<OrderSummary> findByorderDetails(Long details);
	public List<OrderSummary> findByitemPriceLessThanEqual(Double cost);
	public List<OrderSummary> findByitemPriceBetween(Double startprice,Double endprice);
	public List<OrderSummary> findByorderDetailsEquals(Long detail);
	public List<OrderSummary> findByitemPriceanditemCode(Double price,String itemCode);
	//public List<OrderSummary> findByorderDetailsAnditemCount(Long name,Float cost);
	public int updateitemPriceByitemName(Double newPrice,String itemName);

	
}
