package java_Codes;

import java.util.Iterator;

public class LoopingStatement {
	
	public static void main(String[] args) {
	
	int i =1;
	
	do {
		System.out.println("Loop Statement: "+i);
		if (i==3) {
			break;
		}
		i++;
	} while (i <=5);
	
	int a=10;
	String s= "test";
	if (a==5 && s=="test") {
		System.out.println("First Statement");
	}else if (a==7 || s=="test") {
		System.out.println("Second Statement");
	}else {
		System.out.println("Final Statement");
	}
	
	//continue statement
	for (int j = 1; j <=5; j++) {
		if (j==3) {
			continue; 
		}
		System.out.println(j);
	}
	
	}
}
