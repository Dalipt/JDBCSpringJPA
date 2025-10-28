package com.java.order.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.java.order.Entity.OrderSummary;

import jakarta.transaction.Transactional;

public interface IFlipkartOrderSummary extends JpaRepository<OrderSummary, Integer> 
{
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
	@Transactional
	@Modifying
	@Query("UPDATE Order_Summary l SET l.itemPrice = :itemPrice WHERE l.itemName = :itemName")
	public int updateitemPriceByitemName(@Param("itemPrice") Double itemPrice, @Param("itemName") String itemName);

}