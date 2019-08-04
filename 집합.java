package CodePlus;

import java.util.Scanner;

public class 집합 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int bitSet = 0;
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<t; i++)
		{
			String command = sc.next();
			
			if(command.equals("add"))
			{
				int n = sc.nextInt();
				bitSet = bitSet | (1 << --n);
			}
			else if(command.equals("remove"))
			{
				int n = sc.nextInt();
				bitSet = bitSet & ~(1 << --n);
			}
			else if(command.equals("check"))
			{
				int n = sc.nextInt();
				
				int result = bitSet & (1 << --n);
				
				if(result > 0)
					sb.append("1\n");
				else if(result == 0)
					sb.append("0\n");
			}
			else if(command.equals("toggle"))
			{
				int n = sc.nextInt();
				bitSet = bitSet ^ (1 << --n);
			}
			else if(command.equals("all"))
			{
				bitSet = (1 << t) - 1;
			}
			else if(command.equals("empty"))
			{
				bitSet = 0;
			}
		}
		System.out.println(sb.toString());
	}
}
