package com.ruby.java.ch06;

public class DrinkTest {

	public static void main(String[] args) {

		Juice j = new Juice("쥬스", 3000);
		Coffee c = new Coffee("커피", 2000);
		Tea t = new Tea("차", 2500);
	
		System.out.println(j.toString());
		System.out.println(c.toString());
		System.out.println(t.toString());
		
	}
}
