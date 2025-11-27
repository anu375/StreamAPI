package Function;

import java.util.function.Function;

public class Third 
{

	public static void main(String[] args) 
	{
	
		Function<String,Integer>fun=(s)->{return s.split(" ").length;};
		System.out.println(fun.apply("math stat java python"));
	}
}
