package Collections_class;

import java.util.Arrays;
import java.util.List;

public class Third 
{
	public static boolean check(String str)
	{
		return str.endsWith("e");
	}

	public static void main(String[] args)
	{
		List<String>list=Arrays.asList("I","Am","The","Best");
		
		list.stream().filter(Third::check)
		.map(StringBuilder::new)
		.map(StringBuilder::reverse)
		.map(StringBuilder::toString)
		.map(String::toUpperCase)
//		.map(String::length)
		.forEach(System.out::println);
	}

}

class Student
{
	int id;
	String name;
	
	public Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public String getdetails()
	{
		return this.id+" "+this.name;
	}
}

interface I_obj<T>
{
	T red(int i,String name);
}