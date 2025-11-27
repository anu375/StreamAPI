package Function;

import java.util.function.Function;

public class andThen 
{

	public static void main(String[] args) 
	{
	
		Function<Integer,Integer>fun=(i)->{return i*2;};
		Function<Integer,Integer>fun1=(i)->{return i+10;};
		
		Function<Integer,Integer>fun2=fun.andThen(fun1);
		System.out.println(fun2.apply(10));
	}

}
