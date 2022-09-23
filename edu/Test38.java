//package edu;
//
//public class Test38 {
//	public static void main(String[] args) { //main + ctrl + 스페이스바
//			
//		int[][] arr = new int[5][5];
//		int num = 1;
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = num++;
//			}
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.println(arr[i][j]);
//				System.out.println("\t");
//		}
//		System.out.println("\n");
//	}
//}
//}

package edu;

import java.util.Scanner;

public class Test38 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
//			int[] arr = new int[5];
//			
//			for (int i = 0; i < arr.length; i++) {
//				arr[i] = sc.nextInt();
//				System.out.println(arr[i]);
//			}		
			
			int[][] arr = new int[4][3];
			
			for (int i = 0; i < arr.length; i++) { //행길이
				for (int j = 0; j < arr[i].length; j++) { //열길이
					arr[i][j] =sc.nextInt();
					System.out.printf(arr[i][j]+ "\t");
				}
				System.out.println();
			}
		}
}

