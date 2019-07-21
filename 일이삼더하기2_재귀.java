package CodePlus;

import java.util.Scanner;

public class 일이삼더하기2_재귀 {
	static int nIndex,nCnt,nCnt2 = 0;
	static int[] arrHistory = new int[11];
	
	public static int go(int count, int sum, int goal)
	{
		if(sum > goal)
			return 0;
		
		if(sum == goal)
		{
			nCnt++;
			
			if(nCnt == nIndex)
			{
				nCnt2++;
				
				for(int i = 0; i<count-1; i++)
				{
					System.out.print(arrHistory[i] + "+");
				}
				System.out.print(arrHistory[count-1]);
			}
			
			return 1;
		}

		int now = 0;
		
		for(int i=1; i<=3; i++)
		{
			arrHistory[count] = i;
			now += go(count + 1, sum + i, goal);
		}
		
		return now;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		nIndex = sc.nextInt();
		
		go(0, 0, n);
		
		if(!(nCnt2 > 0))
		{
			System.out.println(-1);
		}
	}
}
