package Function;

import java.util.function.Function;

public class Second 
{

	public static void main(String[] args) 
	{
	
		Function<String,Integer>fun1=(i)->{return i.length();};
		System.out.println(fun1.apply("Anushka"));
		
		
	}
}
