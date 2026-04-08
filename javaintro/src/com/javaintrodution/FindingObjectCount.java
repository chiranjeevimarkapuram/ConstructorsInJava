package com.javaintrodution;

public class FindingObjectCount {
	static int count=0;
	{
		count=count+1;
	}
	
	public static void main(String[] args) {
		
		FindingObjectCount a= new FindingObjectCount();
		
		FindingObjectCount b= new FindingObjectCount();
		
		FindingObjectCount c= new FindingObjectCount();
		
		FindingObjectCount d= new FindingObjectCount();
		
		System.out.println("objectcount:"+count);		
		
		}
}