package DP;

import java.util.Scanner;

//Bottom-Up방식
public class practice_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] d = new int[1000001];
		
		int n = sc.nextInt();
		
		d[0] = 0;
		d[1] = 1;
		
		for(int i=0; i<=n; i++)
		{
			if(i>=2)
				d[i] = d[i-1] + d[i-2];
			
			System.out.print(d[i] + " ");
		}
	}
}
