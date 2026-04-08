package com.javaintrodution;

public class StateBank {

static int acc_no=123;
{
	
	System.out.println("accno:"+acc_no);
		acc_no=acc_no+1;
	
}

int bal;
String Holder_Name;



	public static void main(String[] args) {
		
		System.out.println("------");
		
		StateBank s = new StateBank();
		
		s.bal=99;
		s.Holder_Name="chiru";
		
		System.out.println("bal:"+s.bal);
		System.out.println("Hname:"+s.Holder_Name);
		
		System.out.println("------");
		
	StateBank r =new StateBank();	
	
	r.bal=999;
	r.Holder_Name="Tej";
	System.out.println("bal:"+r.bal);
	System.out.println("Hname:"+r.Holder_Name);
	//System.out.println(r.acc_no);
	
	System.out.println("------");
	
	StateBank j =new StateBank();
	
	j.bal=9999;
	j.Holder_Name="siri";
	
	System.out.println("bal:"+j.bal);
	System.out.println("Hname:"+j.Holder_Name);
	//System.out.println(j.acc_no);

	}

}
