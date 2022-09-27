//방법2) private - getter, setter
package java_ex;

import java.util.Scanner;

public class GcdLam_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a: ");
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();

// 방법2
//		GcdLcm2 gl2 = new GcdLcm2();
//		gl2.setNum1(a);
//		gl2.setNum2(b);
//		gl2.print();

// 방법3
		GcdLcm2 gl3 = new GcdLcm2(a, b) ;
		gl3.print();
	}

}


// private - getter, setter로 바꾸면 외부에서 데이터를 볼 수 없다.