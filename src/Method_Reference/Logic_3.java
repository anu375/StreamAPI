package Method_Reference;

import java.util.Arrays;
import java.util.List;

public class Logic_3 
{

	public static void main(String[] args)
	{
		List<Student>list = Arrays.asList(new Student(78.90,90.89,45.90),
				new Student(45.56,56.78,89.90));
		
		list.stream()
		.map(Avg::Avg_1)
		.map(Avg::show_1)
		.forEach(System.out::println);
	}

}

class Student
{
	double m1;
	double m2;
	double m3;
	
	Student(double m1,double m2,double m3)
	{
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
//	public double avg()
//	{
//		return (m1+m2+m3)/3;
//	}
//	
//	public static String show(double d)
//	{
//		if(d>40 && d<100)
//		{
//			return "Pass";
//		}
//		else
//			return "Fail";
//	}
}

class Avg
{
	public static double Avg_1(Student st)
	{
		double m1 = st.m1;
		double m2 = st.m2;
		double m3 = st.m3;
		
		return (m1+m2+m3)/3;
	}
	
	public static String show_1(double d1)
	{
		if(d1>40 && d1<100)
		{
			return "PASS";
		}
		else
		{
			return "FAIL";
		}
	}
}