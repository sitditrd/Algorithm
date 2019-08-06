package CodePlus;

import java.util.Scanner;

public class 일이삼더하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count=0;
		
		sc.nextLine();
		
		for(int i=1; i<=n; i++) {
			int item = sc.nextInt();
			
			for(int l1=1; l1<=3; l1++) {
				if(l1 == item) 
					count++;
				for(int l2=1; l2<=3; l2++) {
					if(l1+l2 == item) 
						count++;
					for(int l3=1; l3<=3; l3++) {
						if(l1+l2+l3 == item) 
							count++;
						for(int l4=1; l4<=3; l4++) {
							if(l1+l2+l3+l4 == item) 
								count++;
							for(int l5=1; l5<=3; l5++) {
								if(l1+l2+l3+l4+l5 == item) 
									count++;
								for(int l6=1; l6<=3; l6++) {
									if(l1+l2+l3+l4+l5+l6 == item) 
										count++;
									for(int l7=1; l7<=3; l7++) {
										if(l1+l2+l3+l4+l5+l6+l7 == item) 
											count++;
										for(int l8=1; l8<=3; l8++) {
											if(l1+l2+l3+l4+l5+l6+l7+l8 == item) 
												count++;
											for(int l9=1; l9<=3; l9++) {
												if(l1+l2+l3+l4+l5+l6+l7+l8+l9 == item) 
													count++;
												for(int l0=1; l0<=3; l0++) {
													if(l1+l2+l3+l4+l5+l6+l7+l8+l9+l0 == item) 
														count++;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			
			System.out.println(count);
			count=0;
		}
	}
}
