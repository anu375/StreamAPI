package Function;

import java.util.function.Function;

public class Compose 
{

	public static void main(String[] args) 
	{
		
		Function<Integer,Integer>fun1=(i)->{return i*2;};
		Function<Integer,Integer>fun2=(i)->{return i+10;};
		
		Function<Integer,Integer>fun3=fun1.compose(fun2);
		//after.compose(before)
		System.out.println(fun3.apply(10));
	}

}
