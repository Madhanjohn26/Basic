package java_Codes;

import java.util.Scanner;

public class ArmstrongNumbers {
	
	public static void main(String[] args)
	{
		/*Scanner sc = new Scanner(System.in);
		int n=0;
		System.out.println("Enter the Number");
		n=sc.nextInt();
		a=n;*/
		for (int n = 1; n <= 1000; n++) {
			int a=0;int i=0;int j=0;
		
		a=n;
		while (a>0) {
			i=(a%10);
			j=j+(i*i*i);
			a=a/10;
		}
		if (j==n) {
			System.out.println("Armstrong Number" + j);
			
		}
		/*}else {
			System.out.println("Not Armstrong");
		}*/
		
		}
	}
}
	

