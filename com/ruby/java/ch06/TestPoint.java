package com.ruby.java.ch06;

class Point {
	private int x,y;
	
	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}	
	public void getTestPoint() {
		System.out.println("x = " + x + "\n" + "y = " + y) ;
	}	
}


class ColorPoint extends Point {
	private String color;
	
	public void setColorPoint (int x , int y, String s) {
		this.color = s;
	}	
	public void getColorPoint () {
		System.out.println ("color = " + color);		
	}		
}


public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p = new Point();
		ColorPoint cp = new ColorPoint();
		p.setPoint(10, 20);
		cp.setColorPoint(10, 20, "red");
		p.getTestPoint();
		cp.getColorPoint();
		
	}

}

