package CodePlus;

import java.util.Scanner;

public class 다음순열 {

	public static boolean Next_permutation(int[] a) {
		int i = a.length - 1;

		//순열의 마지막 수에서 끝나는 가장 긴 감소수열을 찾아야 한다.
		while (i > 0 && a[i - 1] >= a[i]) {
			i -= 1;
		}

		// 마지막 순열
		if (i <= 0)
			return false;

		int j = a.length - 1;

		//j >= i이면서, A[j] > A[i-1]을 만족하는 가장 큰 j를 갖는다.
		while (a[j] <= a[i - 1]) {
			j -= 1;
		}

		//A[i-1]과 A[j]를 Swap한다.
		int temp = a[i - 1];
		a[i - 1] = a[j];
		a[j] = temp;

		j = a.length - 1;

		//A[i]부터 순열을 뒤집는다.
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
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		while(Next_permutation(a))
		{
			if(a[0] != 0)
				break;
			
			for (int i = 0; i < n; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		} 

	}
}
