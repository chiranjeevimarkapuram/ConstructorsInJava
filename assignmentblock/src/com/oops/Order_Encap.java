package com.oops;

public class Order_Encap {
	
	private int order_Id;
	private String item_Name;
	private int quantity;
	private boolean order_Status;
	private int  Price;
	
	public int getOrder_Id() {
		return order_Id;
	}
	public void setOrder_Id(int order_Id) {
		this.order_Id = order_Id;
	}
	
	
	public String getItem_Name() {
		return item_Name;
	}
	public void setItem_Name(String item_Name) {
		this.item_Name = item_Name;
	}
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public boolean isOrder_Status() {
		return order_Status;
	}
	public void setOrder_Status(boolean order_Status) {
		this.order_Status = order_Status;
		
	}
	
	

}
