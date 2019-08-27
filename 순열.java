package CodePlus;

import java.util.Scanner;

public class 순열 {
	public static int nIndex = 0;
	public static boolean nextPermutation(int[] a)
	{
		int i = a.length - 1;
		
		while(i > 0 && a[i-1] >= a[i])
			i--;
		
		if(i <= 0)
			return false;
		
		int j = a.length - 1;
		
		while(a[i-1] >= a[j])
			j--;
		
		int temp = a[i-1];
		a[i-1] = a[j];
		a[j] = temp;
		
		j = a.length - 1;
		
		while(i<j)
		{
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}

		return true;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextLine())
		{
			String[] strVal = sc.nextLine().split(" ");
			char[] chrMatrix = strVal[0].toCharArray();
			int[] arrMatrix = new int[chrMatrix.length];
			
			int nCnt = 1;
			int nFlag = 0;
			
			for(int i=0; i<chrMatrix.length; i++)
				arrMatrix[i] = chrMatrix[i]-48;
					
			nIndex = Integer.parseInt(strVal[1]);
			
			if(arrMatrix[0] > 32)
			{
				for(int i=0; i<chrMatrix.length; i++)
				{
					chrMatrix[i] = (char)(arrMatrix[i] + 48);
				}
				
				for(char ch : chrMatrix)
					System.out.print(ch);
			}
			else
			{
				for(int i : arrMatrix)
					System.out.print(i);
			}
			
			System.out.print(" " + nIndex + " = ");
			
			while(nCnt != nIndex)
			{
				if(nextPermutation(arrMatrix))
					nCnt++;
				else
				{
					System.out.println("No permutation");
					nFlag = 1;
					break;
				}
			}
			
			if(nFlag == 0)
			{
				if(arrMatrix[0] > 32)
				{
					for(int i=0; i<chrMatrix.length; i++)
					{
						chrMatrix[i] = (char)(arrMatrix[i] + 48);
					}
					
					for(char ch : chrMatrix)
						System.out.print(ch);
				}
				else
				{
					for(int i : arrMatrix)
						System.out.print(i);
				}
				System.out.println();
			}
		}
	}
}
