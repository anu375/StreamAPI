package Intermediate_Terminal_Operation;

import java.util.function.Function;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Custom_Map {

	public static void main(String[] args) {
		
		Student_First s1 = new Student_First(1,"Sneha");
		Student_First s2 = new Student_First(2,"Monika");
		Student_First s3 = new Student_First(3,"Kaveri");
		
		Set<Student_First>set = new HashSet<Student_First>();
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		Map<String, String>pincode = new HashMap<String, String>();
		
		pincode.put("Sneha", "123456");
		pincode.put("Monika", "907867");
		pincode.put("Kaveri", "112233");
		
		System.out.println(set);
		
		set.stream()
		.map((i)->{return new Student_Latest(i.id,i.name,pincode.get(i.name));})
		.forEach((i)->{System.out.println(i);});
	}
}

class Student_First
{
	int id;
	String name;
	
	public Student_First(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public String toString()
	{
		return this.name+" "+this.id;
	}
}

class Student_Latest
{
	int id;
	String name;
	String pincode;
	
	public Student_Latest(int id, String name,String pincode)
	{
		this.id = id;
		this.name = name;
		this.pincode = pincode;
	}
	
	public String toString()
	{
		return this.name+" "+this.id+" "+this.pincode;
	}
}

class Converter implements Function<Student_First, Student_Latest>
{
	public Student_Latest apply(Student_First t)
	{
		Student_Latest stud = new Student_Latest(t.id,t.name,"345671");
		return stud;
	}
}