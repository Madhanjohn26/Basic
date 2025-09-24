package java_Codes;

import java.util.Scanner;

public class PalindromNumber {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0,i=0,j=0;
		System.out.println("Welcome");
		a=n;
		while (a>0) {
			i=a%10;
			j=j*10+i;
			a=a/10;
		}
		if (j==n) {
			System.out.println("Palindrom");
		}

		
	}

}
