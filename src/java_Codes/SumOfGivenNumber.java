package java_Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.Lists;

public class SumOfGivenNumber {

	public static void main(String[] args) {
		int n=12345;
		int a=0;int i;int j=0;
		a=n;
		System.out.println(a);
		List<Integer> li = new ArrayList<Integer>();
		List<Integer> li1 = new ArrayList<Integer>();
		li1.add(5);
		li1.add(4);
		li1.add(3);
		li1.add(2);
		li1.add(1);
		
		while (a>0) {
			i=a%10;
			li.add(i);
			j=j*10+i;
			a=a/10;
		}
		System.out.println(li);
		//System.out.println(Collections.max(li));
		//Collections.reverse(li);
		//Collections.sort(li);
		//System.out.println(li);
		ArrayList<Integer> li3 = Lists.newArrayList(1,2,3);
		System.out.println(li3);
		boolean equals = Arrays.equals(li.toArray(), li1.toArray());
		System.out.println(equals);
		

	}

}
