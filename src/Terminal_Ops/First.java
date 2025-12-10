package Terminal_Ops;

import java.util.function.Supplier;
import java.util.List;
import java.util.ArrayList;

public class First 
{
    public static void main(String[] args) 
    {
        Supplier<List<Integer>> list = ArrayList::new;

        IgetString<Student1> ig = Student1::new;
        System.out.println(ig.getStringObject(new Student1(1,"Radha"), new Student1(2,"Krishna")));
    }
}

interface IgetString<T>
{
    T getStringObject(T t1, T t2);
}

class Student1
{
    int id;
    String name;

    Student1(int id, String name)
    {
    	this.id = id;
    	this.name = name;
    }

    
    Student1(Student1 s1, Student1 s2) 
    {
        this.id = s2.id;
        this.name = s2.name;
    }
    
    public String toString()
    {
    	return this.id+" "+this.name;
    }
}


