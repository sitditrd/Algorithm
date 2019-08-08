package CodePlus;

import java.util.Scanner;

public class 부분수열의합 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arrMatrix = new int[n+1];
		int m = sc.nextInt();
		int sum = 0, ans = 0;
		
		for(int i=0; i<n; i++) 
		{
			arrMatrix[i] = sc.nextInt();
		}
		
		for(int i=1; i<(1<<n); i++) //i가 1부터 시작하는 이유 : 문제의 n의 범위는 0<=N<=20이 아닌, 1<=N<=20이므로 공집합이 아닌 부분집합을 의미한다. 따라서 i는 1부터 시작한다.
									//i가 (1<<n)까지인 이유 : 전체 부분집합의 경우의 수가 2^n-1을 의미한다.
		{
			sum = 0;
			for(int j=0; j<n; j++) 
			{
				if((i & (1<<j)) > 0) //집합에 무엇이 들어있는지 확인하기 j는 곧 배열의 인덱스로 사용할 것이다.
				{
					sum += arrMatrix[j]; 
				}
			}
			
			if(sum == m)
				ans++;
		}
		
		System.out.println(ans);
	}	
}
