package com.constructorsclassDemo;

public class CustClassDemo {
	int age;
	long Phone;
	String name;
	int cid;

	CustClassDemo() {
		this(101);// calling one agr constructor into no agr constructor.
		// When we pass the value for the parameterized
		// constructor and also from this(101) its takes value from parameterized
		// Constructor only

		System.out.println("***No agrs Constructor*** ");
	}

	CustClassDemo(int cid) {
		this(cid, 987l); // This Value 987l printed in the next constructor.
		System.out.println("-------One agrs constructor----------");
		// this.cid = cid;
		// this.Phone=Phone;
	}

	CustClassDemo(int cid, long Phone) {
		this(cid, Phone, 22);// direct take from the four agrs constructor
		System.out.println("<<<Two agrs Constructor>>>");
//		this.cid = cid;
//		this.Phone = Phone;
//		this.name=name;
	}

	CustClassDemo(int cid, long Phone, int age) {
		this(cid, Phone, age, "Unknown");
		System.out.println("::::::Three agrs Constructor::::::");
//		this.cid = cid;
//		this.age = age;
//		this.Phone = Phone;
	}

	CustClassDemo(int cid, long Phone, int age, String name) {
		System.out.println("#####Four agrs COnstructor####");
		this.cid = cid;
		this.age = age;
		this.Phone = Phone;
		this.name = name;
	}

	void display() {
		System.out.println("******Display Method Called******** ");
		System.out.println("Your Id:" + cid);
		System.out.println("Your phone number:" + Phone);
		System.out.println("your age:" + age);
		System.out.println("Name is:" + name);

	}

	public static void main(String[] args) {
		System.out.println("+++Main Method started+++");

		CustClassDemo c1 = new CustClassDemo();// no agrs
		// c1.display();

		CustClassDemo c2 = new CustClassDemo(102);// one agrs
		c2.display();

		CustClassDemo c3 = new CustClassDemo(103, 12345678l);// two agrs
		// c3.display();

		CustClassDemo c4 = new CustClassDemo(104, 444444444444l, 33);// three agrs
		// c4.display();

		// CustClassDemo c5 = new CustClassDemo(4, 987654L, 33, "Chiru");
		// c5.display();
	}

}