package edu;

public class 구구단 {

	public static void main(String[] args) {

////		int dan = 1;
//		
//		for(int i = 2; i <= 9; i++) {
//			for(int j = 1; j <=9; j++) {
//				System.out.printf("%d * %d = %d\n", i, j, i*j);
//			}
//			System.out.println("");
//		}

	int dan = 4;
		for(int i = 2; i <=9; i+=dan) {
			for(int j = 1; j<=9; j++) {
				for(int k = 0; k < dan; k++) {
					System.out.printf("%d * %d = %d", i+k, j, i*j);
				
					if(k < dan-1)
						System.out.println("\t");
					else
						System.out.println("\n");
				}
			}
			System.out.println("");
		}
	}
}