package Function;

import java.util.function.Function;

public class Fifth
{

	public static void main(String[] args) 
	{
		
		Function<String,String>fun=(s)->{return s.substring(0,3);};
		System.out.println(fun.apply("anushka"));
	}

}
