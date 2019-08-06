package CodePlus;

import java.util.Arrays;
import java.util.Scanner;

public class 차이를최대로 {

	public static boolean next_Permutation(int[] a)
	{
		int i = a.length - 1;
		
		while(i > 0 && a[i-1] >= a[i])
			i -= 1;
		
		if(i <= 0)
			return false;
		
		int j = a.length -1;
		
		while(a[j] <= a[i-1])
			j -= 1;
		
		int temp = a[i-1];
		a[i-1] = a[j];
		a[j] = temp;
		
		j = a.length -1;
		
		while(i < j)
		{
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		
		return true;
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] aryMatrix = new int[n];
		int nMax = -987654321, nSum=0;
		
		for(int i=0; i<n; i++)
		{
			int item = sc.nextInt();
			aryMatrix[i] = item; 
		}
		
		Arrays.sort(aryMatrix);
		
		while(next_Permutation(aryMatrix))
		{
			for(int i=0; i<aryMatrix.length-1; i++)
			{
				nSum += Math.abs(aryMatrix[i] - aryMatrix[i+1]);
			}
			
			//최댓값
			if(nMax < nSum)
				nMax = nSum;
			
			//초기화
			nSum = 0;
		}
		
		System.out.println(nMax);
	}
}
