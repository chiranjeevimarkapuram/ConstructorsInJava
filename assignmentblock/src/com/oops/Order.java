package com.oops;

public class Order {

	public static void main(String[] args) {
		System.out.println("Main Method Started..!");

		Order_Encap or1 = new Order_Encap();
		or1.setOrder_Id(1);

		or1.setItem_Name("Rice");
		or1.setQuantity(1);
		or1.setOrder_Status(false);

		if (or1.getQuantity() > 0) {
			System.out.println("Order_Id: " + or1.getOrder_Id());
			System.out.println("Quantity:" + or1.getQuantity());
			System.out.println("Item_Name:" + or1.getItem_Name());
			System.out.println("Order_Status:" + " Order Placed");
		} else if (or1.getQuantity() == 0) {
			System.out.println("Please Select Items");
		} else {
			System.out.println("Order_Status:" + "Order Not placed ..");
		}

		System.out.println("Main Method Ended..!");
	}
}
