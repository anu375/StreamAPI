package Function;

import java.util.function.Function;

public class andThen1 
{

	public static void main(String[] args)
	{
		
		Function<String,String>fun1=(s)->{return s.toLowerCase();};
		Function<String,String>fun2=(s)->{return s.toUpperCase();};
		
		Function<String,String>fun3=fun1.andThen(fun2);
		System.out.println(fun3.apply("Anushka"));
	}

}
