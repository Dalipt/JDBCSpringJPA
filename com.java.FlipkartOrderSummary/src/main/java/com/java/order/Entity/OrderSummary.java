package com.java.order.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class OrderSummary 
{
	@Id
	private Integer orderId;
	private String addProductsinfo;
	private String 	itemCode;
	private String 	itemName;
	private Double	itemPrice;
	private Float	itemCount;
	private Long    orderDetails;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getAddProductsinfo() {
		return addProductsinfo;
	}
	public void setAddProductsinfo(String addProductsinfo) {
		this.addProductsinfo = addProductsinfo;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public Float getItemCount() {
		return itemCount;
	}
	public void setItemCount(Float itemCount) {
		this.itemCount = itemCount;
	}
	public Long getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(Long orderDetails) {
		this.orderDetails = orderDetails;
	}
	public OrderSummary(Integer orderId, String addProductsinfo, String itemCode, String itemName, Double itemPrice,
			Float itemCount, Long orderDetails) {
		super();
		this.orderId = orderId;
		this.addProductsinfo = addProductsinfo;
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemCount = itemCount;
		this.orderDetails = orderDetails;
	}
	public OrderSummary() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderSummary [orderId=" + orderId + ", addProductsinfo=" + addProductsinfo + ", itemCode=" + itemCode
				+ ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemCount=" + itemCount + ", orderDetails="
				+ orderDetails + "]";
	}
}