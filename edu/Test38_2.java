//package edu;
//
//import java.util.Scanner;
//
//public class Test38_2 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in) ;
//		int[] arr = new int[5] ;
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//			System.out.println(arr[i]);
//		}
//		
//
//	}
//
//}

package edu;

import java.util.Scanner;

public class Test38_2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][3];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
				
				System.out.printf(arr[i][j] + "\t");				
			}
			System.out.println();
		}
	}

}