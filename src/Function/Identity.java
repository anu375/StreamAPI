package Function;

import java.util.function.Function;

public class Identity 
{

	public static void main(String[] args) 
	{
		Function<Integer, Integer> f = Function.identity();

		System.out.println(f.apply(100));
		
	}

}
