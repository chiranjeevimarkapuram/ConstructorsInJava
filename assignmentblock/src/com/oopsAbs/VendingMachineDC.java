package com.oopsAbs;

//Main class (Driver / Driver Class)
//This is the driver class that contains main() method
//Creates objects and runs the program
//Method
//
//isFree()
//Item
//Returns true if code is palindrome
//
//insertCoin(int c)
//VendingMachine
//Adds coins inserted by user
//buyItem(Item i)
//VendingMachine
//Buys or gives item based on conditions
public class VendingMachineDC {

	int insertCoin(int coin) {
		
		
		return coin;
	}

	void buyItem() {

	}

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		vm.coins();
		vm.buyItem();

		ItemClass ic = new ItemClass(null , 0, null);
		ic.isFree();

	}

}
