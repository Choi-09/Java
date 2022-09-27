package com.ruby.java.ch06;

public class Coffee extends Drink {
private int price;
	
	public Coffee() {
//		super();
//		System.out.println("Coffee 생성자 실행!");
	}
	public Coffee(String name, int price) {
		super(name);
		this.price = price;
//		System.out.println("Coffee(name, price) 생성자 실행!");
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
