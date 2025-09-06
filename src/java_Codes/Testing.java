package java_Codes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Testing {
	
	private void mutabble() {
		
		StringBuffer s = new StringBuffer("Java");
		System.out.println(s+" "+System.identityHashCode(s));
		
		StringBuilder s1= new StringBuilder("Java");
		System.out.println(s1+" "+System.identityHashCode(s1));
		
		s=s.append(s1);
		System.out.println(s+" "+System.identityHashCode(s));
	}
	
	private void immutabbble() {
		String s ="Java";
		System.out.println(s+" "+System.identityHashCode(s));
		String s1="Java";
		System.out.println(s1+" "+System.identityHashCode(s1));
		s=s+s1;
		System.out.println(s+" "+System.identityHashCode(s));
	}
	
	private void numberOfWords() {
		String s="by the people for the people of the people";
		String[] split = s.split(" ");
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		for (String kword : split) {
			if(m.containsKey(kword))
			{
				Integer integer = m.get(kword);
				m.put(kword, integer+1);
			}
			else {
				m.put(kword, 1);
			}
			
		}
		System.out.println(m);
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue()>1) {
				System.out.println(entry);
			}
		}

	}
	
	public static void main(String[] args)
	{
		Testing t= new Testing();
		System.out.println("Mutable");
		t.mutabble();
		System.out.println("Immutable");
		t.immutabbble();
		t.numberOfWords();
	}

}
