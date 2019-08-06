package CodePlus;

import java.util.Scanner;

public class 리모컨 {

	static boolean[] broken = new boolean[10]; //버튼이 망가져 있으면 true, 아니면 false
	
	public static int possible(int c)
	{
		if(c == 0) 
		{
			return broken[0] ? 0 : 1;
		}
		
		int len = 0;
		
		while(c > 0) 
		{
			if(broken[c % 10]) 
			{
				return 0;
			}
			
			len += 1;
			c /= 10;
		}
		return len;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		sc.nextLine();
		
		for(int i=0; i<m; i++) 
		{
			int x = sc.nextInt();
			broken[x] = true;
		}
			
		int ans = Math.abs(n-100);
		
//		if(ans < 0) 
//		{
//			ans = -ans;
//		}
		
		for(int i=0; i<=1000000; i++) 
		{
			int c = i;
			int len = possible(c);
			
			if(len > 0) //len > 0이 아닐경우, +나 -로만 이동한 결과이므로(위에서 수행함) else문을 짜지 않는다.  
			{
				int press = Math.abs(c-n);
				
//				if(press < 0) 
//				{
//					press = -press;
//				}
				
				//최소값 구하는 로직
				if(ans > len + press) 
				{
					ans = len + press;
				}
			}
		}
		
		System.out.printf("%d\n", ans);
	}
}
