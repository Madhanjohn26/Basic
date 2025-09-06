package java_Codes;


import java.util.Iterator;
import java.util.List;

public class Testingdemo {
	

	public static void main(String[] args)
	{
	int count=0;	
	int n =11;
	for(int i=2;i<n-1;i++)
	{
		
			if(n%i==0)
		{
			count=1;
			break;
		}
	}
	if(count==1)
	{
		System.out.print("Prime");
		}
	} 

}

//Program for each word first letter should be caps.