package CodePlus;

import java.util.Arrays;
import java.util.Scanner;

public class 암호만들기 {

	public static boolean check(String password)
	{
		int mo = 0;
		int ja = 0;
		
		for(char c : password.toCharArray())
		{
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			{
				mo += 1;
			}
			else
			{
				ja += 1;
			}
		}
		
		return mo >= 1 && ja >= 2;
	}
	
	public static void go(int n, String[] alpha, String password, int i)
	{
		if(n == password.length())
		{
			if(check(password))
				System.out.println(password);
			
			return;
		}
			
		if(i >= alpha.length)
			return;
		
		go(n, alpha, password + alpha[i], i+1);
		go(n, alpha, password, i+1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		sc.nextLine();
		
		String[] alpha = sc.nextLine().split(" ");
		
		Arrays.sort(alpha);
		
		go(n, alpha, "", 0);
	}
}
