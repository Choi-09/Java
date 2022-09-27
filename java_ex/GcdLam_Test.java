package java_ex;

import java.util.Scanner;

public class GcdLam_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a: ");
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		
		GcdLcm gl = new GcdLcm();
		gl.num1 = a;
		gl.num2 = b;
		
		gl.print();
	}

}
