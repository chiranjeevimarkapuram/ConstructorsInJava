package com.practicemod;

import java.util.*;

class ItemType {
	private String name;
	private double deposit;
	private double costPerDay;

	// Constructor
	public ItemType(String name, double deposit, double costPerDay) {
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}

	// Getters
	public String getName() {
		return name;
	}

	public double getDeposit() {
		return deposit;
	}

	public double getCostPerDay() {
		return costPerDay;
	}
}

public class nao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ItemType> items = new ArrayList<>();

		int n = sc.nextInt();
		sc.nextLine(); // consume newline

		for (int i = 0; i < n; i++) {
			String name = sc.nextLine();
			double deposit = sc.nextDouble();
			double costPerDay = sc.nextDouble();
			if (sc.hasNextLine())
				sc.nextLine(); // consume newline
			items.add(new ItemType(name, deposit, costPerDay));
		}

		// Print header
		System.out.printf("%-20s%-20s%-20s%n", "Name", "Deposit", "CostPerDay");

		// Print each item
		for (ItemType item : items) {
			System.out.printf("%-20s%-20.1f%-20.1f%n", item.getName(), item.getDeposit(), item.getCostPerDay());
		}

		sc.close();
	}
}