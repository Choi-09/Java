package java_ex;

import java.util.Scanner;

public class GcdLcm {	
/*④*/int num1;
/*④*/int num2;
	
/*①*/public static void main(String[] args) { 
/*ctrl + shift + o*/
		Scanner sc = new Scanner(System.in);
		
/*③*/	System.out.print("a: ");
/*②*/	int a = sc.nextInt();
/*③*/	System.out.print("b: ");
/*②*/	int b = sc.nextInt();
		
/*⑤*/	GcdLcm gl = new GcdLcm();
		gl.num1 = a;
		gl.num2 = b;
/*⑥*/	gl.print();

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
