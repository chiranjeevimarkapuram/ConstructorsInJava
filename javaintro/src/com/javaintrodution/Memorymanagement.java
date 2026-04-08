package com.javaintrodution;


public class Memorymanagement {

//instance variables	
int st_id;
String St_Name;

//static variables 

static int Ins_phno;
static String Ins_Name;
static String Trainer_Name;
static String b;
static int i;
	public static void main(String[] args) {
		
		System.out.println("**Welcome to Vcube**");
		System.out.println("Institute Details:");		
//		System.out.println(st_id);
//		System.out.println(St_Name);		
//	    System.out.println(Ins_Name);
//	    System.out.println(Trainer_Name);
//	    System.out.println(Ins_phno);
		
	   
	    System.out.println("Object_1 Creation");	    
	    
	    Memorymanagement cj = new Memorymanagement();
	    	   
	    //static variables we can use without object needed 
	    Ins_phno=123456789;
	    Ins_Name="Vcube";
	    Trainer_Name="sk";
	    b="Batch";
	    i=67;
	    
	    //instance variables using with object only
	    cj.st_id=19;
	    cj.St_Name="chiru";
	    
	    System.out.println("Student_ID: "+ b+"-"+ i+"-"+cj.st_id);
	    System.out.println("Student_Name: "+cj.St_Name);
	    System.out.println("Institute_Name: "+Ins_Name);
	    System.out.println("Trainer_Name: "+Trainer_Name);
	    System.out.println("Institute phno :"+Ins_phno);
	    System.out.println("Object 1 created sucessfully");
	    
	    
	    Memorymanagement st = new Memorymanagement();
	    
	    
	    
	    st.st_id=20;
	    st.St_Name="tej";
	    System.out.println("Student_ID: "+ b+"-"+ i+"-"+st.st_id);
	    System.out.println("Student_Name: "+st.St_Name);
	    System.out.println("Institute_Name: "+Ins_Name);
	    System.out.println("Trainer_Name: "+Trainer_Name);
	    System.out.println("Institute phno :"+Ins_phno);
	    System.out.println("Object 1 created sucessfully");	   
	    
	}

}
