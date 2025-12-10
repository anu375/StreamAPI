package Method_Reference;

import java.util.function.Function;

public class Instance 
{

	public static void main(String[] args)
	{
		Demo_1 d = new Demo_1();
		
		Function<String,Integer>function = d::ac;
		System.out.println(function.apply("abcdef"));
		
		String str = "HELLO ";
		
		Function<String,String>fun = str::concat;
		System.out.println(fun.apply("Alexa"));
	}

}

class Demo_1
{
	public Integer ac(String s)
	{
		return s.length();
	}
}