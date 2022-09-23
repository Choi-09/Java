//배열 곱하기
package edu;

import java.util.Scanner;

	public class Test40_2 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt(), i, j, k, l;
			int d [] = new int [n + 1];
			for (i = 0; i < n; i++) 
				for (j = 0; j < 2; j++) 
					d[i + j] = sc.nextInt();
			sc.close();
			
			int dp[][] = new int[n + 1][n + 1];
			for (l = 0; l < n; l++) {
				for (i = 1; i <n - 1; i++) {
					j = i + l + 1;
					dp[i][j] = Integer.MAX_VALUE;
					for (k = 0; k < j; k++) 
						dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j] + (d[i - 1] * d[k] * d[j]));
				}
			}
			System.out.println(dp[l][n]);
				}
						
		}
	