package Function;

import java.util.function.Function;

public class Custom {

	public static void main(String[] args)
	{
		Function<Student,Teacher>fun1=(t)->{
			Teacher t1 = new Teacher();
			t1.teacher_name = t.student_name;
			return t1;
		};
		
		Function<Human,Student>fun2=(t)->{
			Student s1 = new Student();
			s1.student_name = t.human_name;
			return s1;
		};
		
		Function<Human,Teacher>fun3=fun1.compose(fun2);
		
			Human h1 = new Human();
			h1.human_name = "Sweta";
			
			System.out.println(fun3.apply(h1));
		
	}

}

class Student
{
	String student_name;
	
	public String toString() {
		return "Student : "+this.student_name;
	}
}

class Teacher
{
	String teacher_name;
	
	public String toString() {
		return "Teacher : "+this.teacher_name;
	}
}

class Human
{
	String human_name;
	
	public String toString() {
		return "Human : "+this.human_name;
	}
}