package DP;

import java.util.Scanner;

/*
 * Dynamic Programming
 * 
 * 1. Top-Down (재귀적 구조) 
 * 
 * 2. Bottom-Up (for문 구조)
 * 
 * 3. Memoization 
 * 
 */

//Top-Down방식
public class practice_01 {
	static int d[] = new int[1000001];

	public static int fibo(int n) {
		if (n <= 1)
			return n;
		else 
		{
			if (d[n] > 0)
				return d[n];
			
			d[n] = fibo(n-1) + fibo(n-2);
			return d[n];
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			System.out.print(fibo(i) + " ");
		}
	}
}
