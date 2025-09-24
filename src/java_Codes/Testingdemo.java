package java_Codes;


import java.util.Iterator;
import java.util.List;

public class Testingdemo {
	

	public static void main(String[] args)
	{
		int a[]= {9,2,8,4,6};int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);			
		}
	
	}
}

//Program for each word first letter should be caps.