//방법2,3) private - getter, setter

package java_ex;

import java.util.Scanner;


public class GcdLcm2 {	
	private int num1;
	private int num2;

//방법2
//	public GcdLcm2() {
//		// TODO Auto-generated constructor stub
//	}
	
//	public void setNum1(int num1) {
//		this.num1 = num1;
//	}
//	
//	public void setNum2(int num2) {
//		this.num2 = num2;
//	}
	
//방법3	
	public GcdLcm2(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		}	

	public void print() {
//		유클리스 호제법 최소공배수와 최대공약수를 구한다.\
//		num1 : a, num2 : b
		int max;
		int min;
		
		if (num1 < num2) {
			max = num2;
			min = num1;
		} else {
			max = num1;
			min = num2;
		}
		
		int rem = max%min;
//		if(rem == 0) {
//			System.out.println("최대공약수 : " + min);
//			System.out.println("최소공배수 : " + (num1*num2)/min);
//		}  
		while(rem != 0) {
			max = min ;
			min = rem;
			rem = max%min;
		}
		if(min ==1) {
			System.out.println("최대공약수: 서로소");
		} else {
			System.out.println("최대공약수 : " + min);
		}
		System.out.println("최소공배수 : " + (num1*num2)/min);
	}

}
