package com.constructors;
/*Constructor Chaining (this())
Create a class BankAccount with:
Variables: accountNumber, holderName, balance
Create:
Constructor with only accountNumber
Constructor with accountNumber and holderName (use this(accountNumber) to chain)
Constructor with all fields (use this(accountNumber, holderName))
Create object using the 3rd constructor and print values.*/

public class BankAccount {
	long accountNumber;
	String holderName;
	double balance;
	
	 BankAccount(long accountNumber){
		System.out.println("one-agr constructor with accountnumber");
		this.accountNumber=accountNumber;
	}
	
	BankAccount(long accountNumber,String holderName){
		this(accountNumber);
		System.out.println("Two-agr constructor");
		this.holderName=holderName;
		
	}
	
	public  BankAccount(long accountNumber, String holderName, double balance) {
		this(accountNumber,holderName);
		System.out.println("Three agrs");
		this.balance=balance;
	}

	void show() {
		System.out.println("***Bank Account Details***");
		System.out.println("Your Account Number:"+accountNumber);
		System.out.println("Holder Name is:"+holderName);
		System.out.println("Balance:"+balance);
	}
	
	

	public static void main(String[] args) {
		System.out.println("Main Method Started");
	
		
		BankAccount b3 = new BankAccount(143143,"tej",999);
		b3.show();
		

	}

}
