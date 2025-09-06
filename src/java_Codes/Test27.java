package java_Codes;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test27 {
	
	public static void main(String[] args) {
		
		String s="abcdab";
		Map<Character,Integer> m = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(m.containsKey(c))
			{
				Integer integer = m.get(c);
				m.put(c, integer+1);
			}
			else
			{
				m.put(c, 1);
			}
		}
		System.out.println(m);
	}

}
