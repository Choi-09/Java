package com.ruby.java.ch06;

public class Juice extends Drink {
	private int price;
	
	public Juice() {
//		super();
//		System.out.println("Juice 생성자 실행!");
	}
	public Juice(String name, int price) {
		super(name);
		this.price = price;
//		System.out.println("Juice(name, price) 생성자 실행!");
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
