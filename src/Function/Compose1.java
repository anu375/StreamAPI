package Function;

import java.util.function.Function;

public class Compose1
{

	public static void main(String[] args) 
	{
		Function<String,String>fun1=(s)->{return s.trim();};
		Function<String,String>fun2=(s)->{return s.toUpperCase();};
		
		//trim()->remove start and end space
		
		Function<String,String>fun3=fun1.compose(fun2);
		System.out.println(fun3.apply("  anushka  "));

	}

}
