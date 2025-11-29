package Intermediate_Terminal_Operation;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class LogicalCode {

	public static void main(String[] args) {
		
		List<String>list = new ArrayList<String>();
		
		list.add("parle-g");
		list.add("monaco");
		list.add("marie-gold");
		list.add("milk-bikis");
		list.add("jim-jam");
		list.add("dark-fantasy");
		list.add("patanjali");
		list.add("butter-Bite");
		list.add("oreo");
		list.add("britannia");
		list.add("bounce");
		list.add("happy-happy");
		
		list.stream()
		.map((i)->{return i.toUpperCase();})
		.filter((i)->{return i.startsWith("M");})
		.map((i)->{return i.length();})
		.distinct()
		.sorted(new reverseInt())
		.forEach((i)->{System.out.println(i);});
	}
}

class reverseInt implements Comparator<Integer>
{
	public int compare(Integer i1, Integer i2) {
		return Integer.compare(i1, i2);
	}
}