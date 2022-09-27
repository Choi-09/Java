package com.ruby.java.ch06;

class Point {
	int x,y;
	
	public Point(int x, int y) {
		this.x = x; this.y = y;
		System.out.println("Point()::");
	}		
	public void showTestPoint() {
		System.out.println();
	}	
	}
	


public class TestPoint extends Point {
	private String color;
	public TestPoint(int x , int y, String s) {
		super(x, y);	
		System.out.println ("TestPoint()::");	
		color = s;
	}		


	public static void main(String[] args) {
		
//		Point p = new Point(10, 20);
		TestPoint tp = new TestPoint(10, 20, "red");
		tp.showTestPoint();
	}
}
