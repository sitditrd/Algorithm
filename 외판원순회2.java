package CodePlus;

import java.util.Scanner;

public class 외판원순회2 {

	public static Boolean Next_Permutation(int[] a) {

		int i = a.length - 1;

		while (i > 0 && a[i - 1] >= a[i])
			i -= 1;

		if (i <= 0)
			return false;

		int j = a.length - 1;

		while (a[j] <= a[i - 1])
			j -= 1;

		int temp = a[i - 1];
		a[i - 1] = a[j];
		a[j] = temp;

	    j = a.length-1;
	    
		while (i < j) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i += 1;
			j -= 1;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] Data = new int[n];
		int[][] Array = new int[n][n];

		int Max = Integer.MAX_VALUE;

		sc.nextLine();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				Array[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			Data[i] = i;
		}

		do {
			if(Data[0] != 0)
				break;
			
			boolean ok = true;
			int sum = 0;
			
			for (int i = 0; i < n-1; i++) {
				if(Array[Data[i]][Data[i+1]] == 0) {
					ok = false;
				} else {
					sum += Array[Data[i]][Data[i+1]];
				}
			}
			if(ok && Array[Data[n-1]][Data[0]] != 0) {
				sum += Array[Data[n-1]][Data[0]];
				if(Max > sum) 
					Max = sum;
			}

		} while (Next_Permutation(Data));

		System.out.println(Max);
	}
}
