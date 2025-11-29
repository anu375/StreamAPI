package Intermediate_Terminal_Operation;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.Comparator;

public class String_Unique_Upper {

	public static void main(String[] args) {
		
		String str = "ababcdeeeffgggghi";
		char[] chars = str.toCharArray();
		
		List<Character>list = new ArrayList<Character>();
		
		for(Character c : chars) 
		{
			list.add(c);
		}
		System.out.println(list);
		
		list.stream()
		.distinct()
		.map((i)->{return i.toString().toUpperCase();})
		.sorted(new StringReverse())
		.forEach((j)->{System.out.println(j);});
		
	}
}

class chartostring implements Function<Character,String>
{

	public String apply(Character t) 
	{
		StringBuffer sb = new StringBuffer(t);
		System.out.println(sb.toString().toUpperCase());
		return sb.toString().toUpperCase();
	}
}

class StringReverse implements Comparator<String>
{
	
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}