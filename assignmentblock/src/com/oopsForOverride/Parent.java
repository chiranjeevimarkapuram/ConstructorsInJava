package com.oopsForOverride;

public class Parent {

	public class parent1 {
		int a() {
			return 10;
		}
	}

	public class Child extends parent1 {
		@Override
		int a() {
			return 20;
		}
	}

	
}
