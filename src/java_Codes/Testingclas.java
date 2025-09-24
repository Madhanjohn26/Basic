package java_Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class Testingclas {
	
	public void code1() {
		System.out.println("code1");

	}
	public static void main(String[] args)
	{
		Map<String,Integer> m = new HashMap<String, Integer>();
		m.put("key1",1);m.put("key2",2);m.put("key4",4);m.put("key3",3);m.put(null,null);
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.get("key1"));
		Set<String> keySet = m.keySet();
		System.out.println(keySet);
		Collection<Integer> values = m.values();
		System.out.println(values);
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		System.out.println(m.entrySet());
		
		Set<Integer> s = new TreeSet<Integer>();
		s.add(1);s.add(2);s.add(1);s.add(3);
		System.out.println(s);
			
		String[] colors = {"Red","Green","Yellow","orange"};
		List<String> li2 = new ArrayList<String>();
		for (String string : colors) {
			li2.add(string);
		}
		System.out.println(li2);
		ListIterator<String> iterate = li2.listIterator();
		while(iterate.hasNext())
		{
			//System.out.println(iterate.next());
		}
		List<String> asList = Arrays.asList(colors);
		li2.retainAll(asList);
		//System.out.println(li2);
		
		List<String> li = new ArrayList<String>();
		Collections.addAll(li, colors);
		//System.out.println(li);
		
		//System.out.println(li.size());
		//System.out.println(li.get(0));
		li.set(2, "Orange");
		//System.out.println(li);
		li.remove(2);
		//System.out.println(li);
	}

}
