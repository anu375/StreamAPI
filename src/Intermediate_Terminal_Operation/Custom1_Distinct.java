package Intermediate_Terminal_Operation;

import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

public class Custom1_Distinct 
{
	public static void main(String[] args) 
	{
		Mobile mobile1 = new Mobile(15000,"VIVO T4X");
		Mobile mobile2 = new Mobile(15000,"VIVO T4X");
		Mobile mobile3 = new Mobile(15000,"VIVO T4X");
		Mobile mobile4 = new Mobile(15000,"VIVO T4X");
		
		List<Mobile>list = new ArrayList<Mobile>();
		list.add(mobile1);
		list.add(mobile2);
		list.add(mobile3);
		list.add(mobile4);
		
		list.stream()
		.distinct()
		.forEach((i)->{System.out.println(i);});
	}
}

class Mobile
{
	double price;
	String model;
	
	public Mobile(double $,String name) {
		this.price = $;
		this.model = name;
	}
	
//	public String toString() {
//		return this.model+" "+this.price;
//	}
	
	public int hashCode()
	{
		System.out.println("A");
		return Objects.hash(this.model,this.price);
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("B");
		Mobile mobile = (Mobile)obj;
		return this.price == mobile.price && this.model.equals(mobile.model);
	}
}