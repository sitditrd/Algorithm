package CodePlus;

import java.util.Scanner;

public class 일이삼더하기_재귀 {

	public static int go(int count, int sum, int goal) {
		if(sum > goal)
			return 0;
		if(sum == goal) 
			return 1;
		
		int now = 0;
		 
		for(int i=1; i<=3; i++) {
			now += go(count+1, sum+i, goal);
		}
		
		return now;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res=0;
		
		for(int i=1; i<=n; i++) {
			int item = sc.nextInt();
			res = go(0, 0, item);
			System.out.println(res);
		}
		
		/*while(n --> 0) { //--> 연산자의 결합이다. 먼저 변수를 비교한 다음 감소시킨다.
			int item = sc.nextInt();
			System.out.println(go(0, 0, item));
		}*/

	}

}
