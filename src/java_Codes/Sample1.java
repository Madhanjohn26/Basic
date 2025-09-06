package java_Codes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;



public class Sample1 {
	 static int test=10;
	
		public static void main(String[] args)
	{	
			
			Map<Character, Integer> vow = new HashMap<Character, Integer>();
			Map<Character, Integer> nonvow = new HashMap<Character, Integer>();
			String s ="welcome to java";
			
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					if (vow.containsKey(c)) {
						Integer integer = vow.get(c);
						vow.put(c, integer+1);
					}else {
						vow.put(c, 1);
					}
				}else {
					if (nonvow.containsKey(c)) {
						Integer integer = nonvow.get(c);
						nonvow.put(c, integer+1);
					}else {
						nonvow.put(c, 1);
				}
			}
	}
			
			System.out.println("Vowel :"+vow);
			System.out.println("NOn Vowel :"+nonvow);
			System.out.println(test);
}
}
