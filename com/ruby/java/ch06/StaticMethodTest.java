package com.ruby.java.ch06;

public class StaticMethodTest {

	int num = 123;
		
	public static void main(String[] args) {
		// int num = 123; : 
		StaticMethodTest.print1();
		print1();
		//print2(); : 오류발생
		// static은 객체가 없어도 호출가능(객체가 만들어지기 전에 실행)
		StaticMethodTest exam = new StaticMethodTest();
		exam.print2();
	}
	
	public static void print1() {
		int num2 = num;
		//static은 객체가 만들어지기 전에 한 번 실행되기 때문에 해당부분에서는 num변수를 읽을 수 없다.
		System.out.println("hello");
	}
	
	public void print2() {
		int num3 = num;
		System.out.println("java");
	}
}
 