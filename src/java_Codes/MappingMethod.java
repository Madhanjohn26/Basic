package java_Codes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class MappingMethod {
	
	
	static Map<String, Integer> allmarks= new HashMap<String, Integer>();
	public static Map<String, Integer> mark(Map<String, Integer> marks) {
		marks.putAll(allmarks);
		System.out.println(marks);
		return marks;
	}

	public static Map<String, Integer> mark1(Map<String,Integer> marks1) 
	{
		Map<String, Integer> givenMarks= new HashMap<String, Integer>();
		givenMarks.putAll(marks1);
		System.out.println(givenMarks);
		return givenMarks;
	} 
	
	
	
	public static void main(String[] args)
	{
		Map<String, Integer> marks= new HashMap<String, Integer>();
		marks.put("Tamil", 50);
		marks.put("English", 78);
		//mark(marks);
		//mark1(marks);
		List<Integer> li= new ArrayList<Integer>();
		li.add(50);li.add(70);li.add(80);
		System.out.println(li);
		ListIterator<Integer> iterate = li.listIterator();
		while (iterate.hasNext()) {
			System.out.println(iterate.next());
			//Integer integer = (Integer) iterate.next();
			//System.out.println(integer);
			
		}
		
		
	}

}
