package CodePlus;

import java.util.Scanner;

public class 재귀기초 {
	public static int fnRecursive(int n)
	{
		if(n <= 1)
			return 1;
		
		return n * fnRecursive(n-1);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(fnRecursive(n));
	}
}
