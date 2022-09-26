package com.ruby.java.ch06;

public class TestStatic {

	static void show() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[3][4];
		show();
		TestStatic.show(); //생략가능
		
	}

}
