package Intermediate_Terminal_Operation;

import java.util.Comparator;
import java.util.Deque;
import java.util.ArrayDeque;

public class Custom_Sorted {

	public static void main(String[] args) {
		
		Deque<Plant>plant = new ArrayDeque<Plant>();
		
		plant.add(new Plant(93.33,"Tamarind"));
		plant.add(new Plant(24.50,"Jackfruit"));
		plant.add(new Plant(75.90,"Coconut"));
		
		plant.stream()
		.sorted(new treenamecomparator())
		.map((i)->{return i.toString().toUpperCase();})
		.forEach((i)->{System.out.println(i);});
	}
}

class Plant implements Comparable<Plant>
{
	double price;
	String name;
	
	public Plant(double price, String name)
	{
		this.price = price;
		this.name = name;
	}
	
	public String toString()
	{
		return this.price+" "+this.name;
	}
	
	public int compareTo(Plant o)
	{
		return Double.compare(o.price, this.price);
	}
}

class treenamecomparator implements Comparator<Plant>
{
	public int compare(Plant i,Plant i1)
	{
		return i.compareTo(i1);
	}
}