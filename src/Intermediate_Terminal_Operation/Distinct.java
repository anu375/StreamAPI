package Intermediate_Terminal_Operation;

import java.util.List;
import java.util.ArrayList;

public class Distinct 
{

	public static void main(String[] args) 
	{
		
		List<Integer>list = new ArrayList<Integer>();
		
		list.add(23);
		list.add(24);
		list.add(23);
		list.add(24);
		list.add(25);
		list.add(13);
		list.add(25);
		list.add(13);
		
		list.stream()
		.distinct()
		.sorted()
		.forEach((i)->{System.out.println(i);});
	}
}
