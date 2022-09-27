package com.ruby.java.ch06;

public class Tea extends Drink {
private int price;
	
	public Tea() {
//		super();
//		System.out.println("Tea 생성자 실행!");
	}
	public Tea(String name, int price) {
		super(name);
		this.price = price;
//		System.out.println("Tea(name, price) 생성자 실행!");
	}
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return super.toString() + price;
	}
}