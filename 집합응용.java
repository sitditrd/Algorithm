package CodePlus;

import java.util.Scanner;

public class 집합응용 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int bitSet = 0;
		String strIndex = "";
		
		System.out.println("정수 : " + n);
		
		String binary = Integer.toBinaryString(n);
		
		System.out.println("정수를 이진화한 결과 값 : " + binary);
		System.out.println();
		
		for(int i =0; i<binary.length(); i++)
		{
			bitSet = n & (1 << i);
			
			if(bitSet > 0)
			{
				strIndex += i + ",";
				System.out.println(i + "의 weight 값 : " + bitSet);
			}
			else 
			{
				System.out.println(i + "의 weight 값 : " + 0);
			}
		}
		
		System.out.println();
		
		System.out.println();
		
		String[] arrStrIndex = strIndex.split(",");
		
		System.out.println("집합");
		
		System.out.print("{");
		for(int i=0; i<arrStrIndex.length-1; i++)
		{
			System.out.print(arrStrIndex[i] + ",");
		}
		System.out.print(arrStrIndex[arrStrIndex.length-1]);
		System.out.print("}");
	}
}
