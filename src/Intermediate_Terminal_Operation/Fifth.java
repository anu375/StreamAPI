package Intermediate_Terminal_Operation;

import java.util.List;
import java.util.ArrayList;

public class Fifth 
{

	public static void main(String[] args)
	{
		
		List<Student>s = new ArrayList<Student>();
		
		s.add(new Student(21,"Anushka","Nashik"));
		s.add(new Student(22,"Sakshi","Nashik"));
		s.add(new Student(23,"Mayuri","Latur"));
		s.add(new Student(24,"Gayatri","Sambhaji Nagar"));
		s.add(new Student(25,"Sweta","Pune"));
		
		s.stream().filter((p)->{return p.age>23;})
		.forEach((p)->{System.out.println(p.name+" : "+p.age);});
	}

}

class Student
{
	int age;
	String name;
	String city;
	
	public Student(int age,String name, String city) 
	{
		this.age = age;
		this.name = name;
		this.city = city;
	}
}