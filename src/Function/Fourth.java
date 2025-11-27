package Function;

import java.util.function.Function;

public class Fourth {

	public static void main(String[] args) 
	
	{
	
		Function<String,String>reverse=(s)->{
			return new StringBuilder(s).reverse().toString();
			};
		System.out.println(reverse.apply("Anushka"));
	}
}
