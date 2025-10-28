package com.java.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.order.Entity.OrderSummary;
import com.java.order.Repo.IFlipkartOrderSummary;
@Service
public class FlipkartOrderServices implements IFlipkartOrderService {

	 	private IFlipkartOrderSummary repo;

	    @Autowired
	    public void setRepo(IFlipkartOrderSummary repo) {
	        this.repo = repo;
	    }

		@Override
		public String addProductInfo(OrderSummary summary) {
			OrderSummary lib=repo.save(summary);
			return "OrderSummary added with id "+lib.getOrderId();
		}

		@Override
		public Iterable<OrderSummary> registerMultipleProductInfo(Iterable<OrderSummary> summary) {
			// TODO Auto-generated method stub
			return repo.saveAll(summary);
		}

		@Override
		public List<OrderSummary> findByorderId(Integer Id) {
			// TODO Auto-generated method stub
			return repo.findByorderId(Id);
		}

		@Override
		public List<OrderSummary> findByitemCode(String Code) {
			// TODO Auto-generated method stub
			return repo.findByitemCode(Code);
		}

		@Override
		public List<OrderSummary> findByitemName(String name) {
			// TODO Auto-generated method stub
			return repo.findByitemName(name);
		}

		@Override
		public List<OrderSummary> findByitemPrice(Double price) {
			// TODO Auto-generated method stub
			return repo.findByitemPrice(price);
		}

		@Override
		public List<OrderSummary> findByitemCount(Float count) {
			// TODO Auto-generated method stub
			return repo.findByitemCount(count);
		}

		@Override
		public List<OrderSummary> findByorderDetails(Long details) {
			// TODO Auto-generated method stub
			return repo.findByorderDetails(details);
		}

		@Override
		public List<OrderSummary> findByitemPriceLessThanEqual(Double cost) {
			// TODO Auto-generated method stub
			return repo.findByitemPriceLessThanEqual(cost);
		}

		@Override
		public List<OrderSummary> findByitemPriceBetween(Double startprice, Double endprice) {
			// TODO Auto-generated method stub
			return repo.findByitemPriceBetween(startprice, endprice);
		}

		@Override
		public List<OrderSummary> findByorderDetailsEquals(Long detail) {
			// TODO Auto-generated method stub
			return repo.findByorderDetailsEquals(detail);
		}

		@Override
		public List<OrderSummary> findByitemPriceanditemCode(Double price, String itemCode) {
			// TODO Auto-generated method stub
			return repo.findByitemPriceanditemCode(price, itemCode);
		}

		@Override
		public int updateitemPriceByitemName(Double newPrice, String itemName) {
			// TODO Auto-generated method stub
			return repo.updateitemPriceByitemName(newPrice, itemName);
		}

	

}
