package com.constructorsclassDemo;

public class Emp1 {
	//instance variables and Global variables
	int EmpId;
	String EmpName;
	double Empsal;
	//Instance Method 
	void show() {
		System.out.println("Employee Id:"+EmpId);
		System.out.println("Employee Name:"+EmpName);
		System.out.println("Employee Salary:"+Empsal);
	}

	//Once we can created the any Constructor like No-args, parameterized. 
	//Default Constructor is removed by the JVM Automatically 
	//no-args constructors perform whenever we create a (no-agrs)constructor
	//constructor name always starts with class name only
	
	//no-agrs constructor
	Emp1(){
		System.out.println("***********");
		System.out.println("no-agrs constructor called..!");
		//In these constructor also we can assign the values from global variables .
		EmpId=101;
		EmpName="Tejesh";
		Empsal=40000;	
	}
	//JVM
	//gives piroty for local variables  
	//Parameterized Constructor 
	Emp1(int EmpId,String EmpName,double Empsal){//We can use variables names our Wish	
		System.out.println("***Paramaterized Constructor Called..!***");
		
		 this.EmpId=EmpId; this.EmpName=EmpName; this.Empsal=Empsal;
		 
		
//		 Emp1 e7 = new Emp1();
//		 e7.EmpId
		 
		
	}
//	Emp1(int eid,String name,int salary){
//		System.out.println("parameterized constructor2 called");
//		this.EmpId=eid;
//		this.EmpName=name;
//		this.Empsal=salary;
//		
//	}
	public static void main(String[] args) {
	Emp1 e5 = new Emp1();//Whenever Object is created Constructor will call Automatically
	System.out.println("Main Method Started..!");
	
	// JVM will automatically created a default constructor 
	Emp1 e1 = new Emp1();//Emp1() So,this object creation is called default constructor 
	e1.EmpId=100;
	e1.EmpName="Chiru"; 
	e1.Empsal=30000;
	e1.show();//object reference variables
	
	Emp1 e2 = new Emp1();
	e2.show();//shows constructor values
	
	Emp1 e3 = new Emp1();
	e3.EmpId=103;
	e3.EmpName="siri";
	e3.Empsal=35000;
	e3.show();//object reference variables
	
	Emp1 e4 = new Emp1();
	e4.show();//shows constructors default values Why because We could not passing values Using e4,
				//so it can assign default values from the no-agrs constructor 
	
	Emp1 e6 = new Emp1(104,"vijay",35750);//assigning the values using parameterized constructor.
	e6.show();
	
	Emp1 e8 = new Emp1(105,"surya",35550);//assigning the values using parameterized constructor.
	e8.show();
	
	Emp1 e9=new Emp1(106,"unknown",100000);
	e9.show();
	
	}

}
